package di.sp.main;

import di.sp.beans.Topper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String path="/di/sp/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(path);

        Topper t=(Topper) context.getBean("std");
        t.display();
    }
}
