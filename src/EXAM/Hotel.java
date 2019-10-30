package EXAM;

import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;


    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin hotel");
        System.out.println("name");
        setName(sc.nextLine());
        System.out.println("location");
        setLocation(sc.nextLine());
        System.out.println("ownerName");
        setOwnerName(sc.nextLine());
    }

    public void showInfo(){
        System.out.println("name"+this.getName());
        System.out.println("location"+this.getLocation());
        System.out.println("ownerName"+this.getOwnerName());


    }
}
