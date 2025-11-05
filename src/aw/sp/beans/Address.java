package aw.sp.beans;

public class Address {
    private String houseNo;
    private int roomNo;
    private int pinCode;

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "#"+houseNo+","+roomNo+","+pinCode;
    }
}
