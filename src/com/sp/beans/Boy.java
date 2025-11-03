package com.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Value("Haris")
    private String name;
    @Value("1")
    private int id;
    @Value("44.4")
    private float marks;

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Marks: "+marks);
    }
}
