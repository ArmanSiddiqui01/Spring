package aw.sp.main;

import aw.sp.beans.Student;
import aw.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student s=(Student) context.getBean("std");
        s.display();
    }
}
