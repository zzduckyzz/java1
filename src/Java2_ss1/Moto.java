package Java2_ss1;

import java.util.PriorityQueue;

public class Moto implements Comparable<Moto> {
    public String name;
    public int age;

    public Moto(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Moto o) {
//        return this.name.compareTo(o.name);
        if(this.age < o.age){
            return -1;
        }else {
            return 1;
        }
    }

}
