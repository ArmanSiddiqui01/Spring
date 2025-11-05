package aww.sp.main;

import aww.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String path="/aww/sp/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(path);

        Student s=(Student) context.getBean("std");
        s.display();
        //byName=> reference name is present in id="address"
        //byType=> private Address address; Address ka bean object created or not,
        //remember make sure object can multiple created with different id than it shows error
        // than u can use autowire-candidate="true,false" also it use setter method of address
        //constructor=> constructor is present in student
    }
}
