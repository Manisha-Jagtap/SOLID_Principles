package com.SOLIDPrinciple.Designpatterns.SimpleFactory;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class NewsPost extends Post{

    private String headLine;
    private LocalDate newsTime;

}
