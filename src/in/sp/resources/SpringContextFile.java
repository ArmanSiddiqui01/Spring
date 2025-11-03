package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContextFile {
    @Bean
    public Student std(){
        Student s=new Student();
        s.setName("deepak");
        s.setId(12);
        s.setEmail("deepak@gmail.com");
        return s;
    }
    @Bean
    public Student std1(){
        Student s=new Student();
        s.setName("Arman Siddiqui");
        s.setId(13);
        s.setEmail("armansiddiqui9011@gmail.com");
        return s;
    }
}
