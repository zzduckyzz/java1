package Asignment5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {

    public ArrayList<PhoneNumber> PhoneLists;

    public PhoneBook(ArrayList<PhoneNumber> phoneLists) {
        PhoneLists = new ArrayList<>();
    }

    @Override
    void insertPhone(String name, String phone) {
        for (PhoneNumber p : PhoneLists){
            if(p.getName().equals(name)){
                if(!p.getPhone().contains(phone)){
                    p.setPhone(p.getPhone()+":"+phone);
                    return;
                }
                return;
            }
        }
        PhoneNumber phoneNumber = new PhoneNumber(name,phone);
        PhoneLists.add(phoneNumber);

    }

    @Override
    void removePhone(String name) {
        for (PhoneNumber p: PhoneLists){
            if(p.getName().equals(name)){
                PhoneLists.remove(p);
                return;
            }
        }

    }

    @Override
    void updatePhone(String name, String newphone) {
        for (PhoneNumber p: PhoneLists){
            if(p.getName().equals(name)){
                p.setPhone(newphone);
                return;
            }
        }

    }

    @Override
    void searchPhone(String name) {
        for (PhoneNumber p: PhoneLists){
            if(p.getName().equals(name)){
                System.out.println(p.getPhone());
                return;
            }
        }

    }

    @Override
    void sort() {
        Collections.sort(PhoneLists, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber phoneNumber, PhoneNumber t1) {
                return phoneNumber.getName().compareTo(t1.getName());
            }
        });
        for (PhoneNumber p: PhoneLists){
            System.out.println("name "+p.getName()+"phone: "+p.getPhone());
        }

    }
}
