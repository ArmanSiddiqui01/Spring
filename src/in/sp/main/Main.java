package in.sp.main;

import in.sp.beans.Student;
import in.sp.resources.SpringContextFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringContextFile.class);
        Student s=(Student) context.getBean("std");
        s.display();
        System.out.println("==========================================");
        Student s1=context.getBean(Student.class);
        s1.display();

    }
}
