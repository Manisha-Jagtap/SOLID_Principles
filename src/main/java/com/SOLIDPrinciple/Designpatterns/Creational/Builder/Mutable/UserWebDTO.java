package com.SOLIDPrinciple.Designpatterns.Creational.Builder.Mutable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserWebDTO implements UserDTO{

    private String name;
    private String address;
    private String age;
}
