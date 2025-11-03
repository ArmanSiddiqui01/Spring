package in.sp.beans;

public class Student {
    private String name;
    private int id;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Email:"+email);
    }
}
