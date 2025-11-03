package com.sp.main;

import com.sp.beans.Boy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String path="/com/sp/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(path);

        Boy s=(Boy) context.getBean("boy");
        s.display();


    }
}
