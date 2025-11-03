package moc.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Nawab {
    @Value("hemant")
    private String name;
    @Value("11")
    private int id;
    @Value("94.2")
    private float marks;

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Marks: " + marks);
    }
}
