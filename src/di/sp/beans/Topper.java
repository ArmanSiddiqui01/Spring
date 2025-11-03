package di.sp.beans;

public class Topper {
    private String name;
    private int roll;
    private Address address; //IMPORTANT

    public void setAddress(Address address) {
        //setter method is used
        this.address = address;
    }

    public void setRoll(int roll) {
        System.out.println("set roll");
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("roll: "+roll);
        System.out.println("Email: "+address);
    }
}
