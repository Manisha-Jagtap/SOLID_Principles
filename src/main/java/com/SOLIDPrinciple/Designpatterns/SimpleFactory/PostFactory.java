package com.SOLIDPrinciple.Designpatterns.SimpleFactory;


/* Here is there where simple Fcatory Logic should come*/


public class PostFactory {

    public static Post createPost(String type){
        switch(type)
        {
            case "blog":
                    return new BlogPost();
            case "news":
                return new NewsPost();
            case "product":
                    return new ProductPost();
            default:
                throw new IllegalArgumentException("Invalid Post, no such post exception");
        }
    }
}
