package di.sp.beans;

public class Address {
    private int houseNo;
    private String city;
    private int pinCode;

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
    public String toString(){
        return "#"+houseNo+","+city+"-"+pinCode;
    }
}
