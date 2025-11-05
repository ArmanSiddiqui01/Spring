package aww.sp.beans;

public class Address {
    private String house;
    private int room;
    private int pinCode;

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house='" + house + '\'' +
                ", room=" + room +
                ", pinCode=" + pinCode +
                '}';
    }
}
