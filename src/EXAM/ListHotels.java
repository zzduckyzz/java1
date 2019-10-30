package EXAM;

import java.util.ArrayList;
import java.util.Scanner;

public class ListHotels {
    public ArrayList<Hotel> listhotel = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addHotel(){
        for ( int i=0;i<10;i++){
            System.out.println("name");
            String name = sc.nextLine();
            System.out.println("location");
            String location = sc.nextLine();
            System.out.println("ownerName");
            String ownerName = sc.nextLine();
            Hotel hotel = new Hotel(name, location,ownerName);
            listhotel.add(hotel);
        }
    }



    public void showInfo(){
        System.out.println("show Hotel");
        String ownerName = sc.nextLine();
        for (Hotel h : listhotel ){
            if (h.getOwnerName().equals(ownerName)){
                System.out.println("name"+h.getName());
                System.out.println("location"+h.getLocation());
                System.out.println("ownerName"+h.getOwnerName());
            }
        }
    }

}
