package com.SOLIDPrinciple.Designpatterns.Creational.Builder;

import lombok.Data;

import java.time.LocalDate;

//Entity class
//
@Data
public class User {

    private String fisrtName;
    private String LastName;
    private LocalDate Birthday;
    private Address address;
}
