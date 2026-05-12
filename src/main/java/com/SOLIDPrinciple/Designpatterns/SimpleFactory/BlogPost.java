package com.SOLIDPrinciple.Designpatterns.SimpleFactory;

import lombok.Data;

@Data
public class BlogPost extends Post{

    private String auther;
    private String tags[];

}
