package aw.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    private String name;
    private int rollNo;
    @Autowired
    private Address address;
    @Autowired
    @Qualifier("sub1")
    private Subjects subjects;

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("rollNo:"+rollNo);
        System.out.println("Address: "+address);
        System.out.println("Subjects: "+subjects);
    }
}
