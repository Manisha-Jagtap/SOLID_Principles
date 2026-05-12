package com.SOLIDPrinciple.Designpatterns.Creational.Builder.Mutable;

import java.time.LocalDate;

//Abstract Builder
public interface UserDTOBuilder {

    //methods to create part of the object
    //we are returning same class reference to use this methods as object chaining
    public UserDTOBuilder withFirstName(String fname);
    UserDTOBuilder withLastName(String lname);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    //assemble the part of object together
    UserDTO build();

    //optional: method to fetch an existing record
    UserDTO getUserDTO();
}
