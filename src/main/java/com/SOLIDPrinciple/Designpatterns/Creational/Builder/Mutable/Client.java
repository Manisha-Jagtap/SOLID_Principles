package com.SOLIDPrinciple.Designpatterns.Creational.Builder.Mutable;

import java.time.LocalDate;

public class Client {

    public static void main(String args[]){
        User user = createUser();
        UserDTOBuilder builder = new UserWebDTOBuilder();
        UserDTO dto = directDTOObject(builder,user);
        System.out.println(dto);
    }

    //create Director to create DTO object
    public static UserDTO directDTOObject(UserDTOBuilder builder,User user )
    {
         return builder.withFirstName(user.getFisrtName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    //Create the Dummy User
    public static User createUser(){
        User user = new User();
        user.setFisrtName("Jayshri");
        user.setLastName("Jagtap");
        user.setBirthday(LocalDate.of(1979,2,1));
        Address address= new Address("12","Maruti Street","Pune", "411052","Maharashtra");
        user.setAddress(address);
        return user;
}
}

