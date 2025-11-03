package moc.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //tells SpringConfigFile and beans are there
//@ComponentScan("moc.sp.beans") bean object found
//@ComponentScan({"moc.sp.beans"})
@ComponentScan(basePackages = "moc.sp.beans")
public class SpringConfigFile {
}
