package Java2_ss1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("world");
        hashSet.add("hello");
        hashSet.add("world");
        for (String x : hashSet){
            System.out.println(x);
        }

        System.out.println("vi du Queue");
        PriorityQueue<String> strQueue = new PriorityQueue<>();
        strQueue.add("d");
        strQueue.add("e");
        strQueue.add("c");
        strQueue.add("g");
        strQueue.add("z");
        for (String x : strQueue){
            System.out.println(x);
        }
        PriorityQueue<Moto> moto = new PriorityQueue<>();
        moto.add(new Moto("Toyota",12));
        moto.add(new Moto("Honda",9));
        moto.add(new Moto("Ford",15));
        for (Moto m: moto){
            System.out.println(m.name+"--"+m.age);
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("label1",12);
        hashMap.put("abc",100);
        System.out.println(hashMap.get("label1"));

        HashMap<Integer,Moto> motoHashMap = new HashMap<>();
        motoHashMap.put(1,new Moto("ben",1));
        System.out.println(motoHashMap.get(1).name);
    }
}
