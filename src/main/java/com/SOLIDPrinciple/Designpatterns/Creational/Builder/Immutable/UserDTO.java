package com.SOLIDPrinciple.Designpatterns.Creational.Builder.Immutable;

import com.SOLIDPrinciple.Designpatterns.Creational.Builder.Immutable.Address;
//Make this class Immutable as making fields private and setter private and doesn't containt
//then no outter class object able access any state or behaviour




import java.time.LocalDate;
import java.time.Period;

/*Solution
Make static inner class which will be able to access the setter method and set thr object
and return the DTO object.
 */
public class UserDTO {

    private String name;
    private String address;
    private String age;

    private void setName(String name) {
        this.name = name;
    }
    private void setAddress(String address) {
        this.address = address;
    }
    private void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    public static class UserDTOBuilder{
        private String first_name;
        private String last_name;
        private String age ;
        private String address;
        // You must create the dto object using new keyword otherwise will through Null Pointer Exception.
        private UserDTO dto = new UserDTO();

        public UserDTOBuilder withFirstName(String name)
        {
            first_name = name;
            return this;
        }

        public UserDTOBuilder withLastName(String lname){
            last_name = lname;
            return this;
        }
        public UserDTOBuilder withBirthday(LocalDate date){
            age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
            return this;
        }
        public UserDTOBuilder withAddress(Address address){
            this.address = address.getHouseNumber()+", "+address.getStreet()+"\n"+address.getCity()+","+address.getZipcode()+", "+address.getState();
            return this;
        }

        //assemble the part of object together
        public UserDTO build(){
            dto.setName(first_name+" "+last_name);
            dto.setAge(age);
            dto.setAddress(address);
            return dto;
        }

        //optional: method to fetch an existing record
        public UserDTO getUserDTO(){
            return dto;
        }

    }
}
