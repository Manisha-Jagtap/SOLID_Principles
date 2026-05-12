package com.SOLIDPrinciple.Designpatterns.SimpleFactory;

public class Client {

    public static void main(String[] args) {
        Post classChosen = PostFactory.createPost("blog");
        System.out.println(classChosen);
    }
}
