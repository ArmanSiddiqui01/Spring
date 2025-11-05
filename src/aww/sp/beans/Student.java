package aww.sp.beans;

public class Student {
    private String name;
    private int rollNo;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setter method called in address");
        this.address = address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("rollNo:"+rollNo);
        System.out.println("Address: "+address);
        //System.out.println("Subjects: "+subjects);
    }
}
