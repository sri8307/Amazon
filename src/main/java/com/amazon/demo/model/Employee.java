package com.amazon.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

    private String name;
    private int age;
    private String location;
    private String email;
    private String description;

}
