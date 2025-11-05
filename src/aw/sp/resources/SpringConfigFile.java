package aw.sp.resources;

import aw.sp.beans.Address;
import aw.sp.beans.Student;
import aw.sp.beans.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfigFile {
    @Bean
    public Subjects sub(){
        Subjects s=new Subjects();
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("c++");
        s.setList(list);
        return s;
    }
    @Bean
    public Subjects sub1(){
        Subjects s=new Subjects();
        List<String> list=new ArrayList<>();
        list.add("physics");
        list.add("maths");
        list.add("chemistry");
        s.setList(list);
        return s;
    }
    @Bean
    public Address add(){
        Address a=new Address();
        a.setHouseNo("Java");
        a.setRoomNo(2);
        a.setPinCode(421005);
        return a;
    }
    @Bean
    public Student std(){
        Student s=new Student();
        s.setName("deepak");
        s.setRollNo(2);
       // s.setAddress(add()); //Manually
        //s.setSubjects(sub()); //manually

        return s;
    }

}
