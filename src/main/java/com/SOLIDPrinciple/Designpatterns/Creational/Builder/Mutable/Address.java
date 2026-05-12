package com.SOLIDPrinciple.Designpatterns.Creational.Builder.Mutable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String zipcode;
    private String state;
}
