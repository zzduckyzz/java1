package Asignment5;

public class PhoneNumber {
    public String name;
    public String phone;

    public PhoneNumber(){

    }

    public PhoneNumber(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
