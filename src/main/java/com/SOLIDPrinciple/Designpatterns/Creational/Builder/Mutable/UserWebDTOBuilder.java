package com.SOLIDPrinciple.Designpatterns.Creational.Builder.Mutable;

import java.time.LocalDate;
import java.time.Period;

//to implement the interface class
public class UserWebDTOBuilder implements UserDTOBuilder
{
    private String first_name;
    private String last_name;
    private String age ;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname){
        first_name = fname;
        return this;
    }

    @Override
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
    public UserWebDTO build(){
        dto = new UserWebDTO(first_name+" "+last_name, age, address);
        return dto;
    }

    //optional: method to fetch an existing record
    public UserWebDTO getUserDTO(){
        return dto;
    }
}
