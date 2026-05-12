package com.SOLIDPrinciple.Designpatterns.SimpleFactory;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@Data
public abstract class Post {

    private Long id;
    private String title;
    private String  cntent;
    private LocalDateTime createdOn;
    private LocalDateTime publishedOn;
}
