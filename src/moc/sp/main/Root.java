package moc.sp.main;

import moc.sp.beans.Nawab;
import moc.sp.resources.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Root {
    public static void main(String[] args) {
        //String s="/moc/sp/resources/SpringConfigFile"; in xml file
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Nawab n=(Nawab) context.getBean("nawab");
        n.display();
    }
}
