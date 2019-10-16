package lab5s;

public class Student extends Person {

    public Student() {

        if(check18()){
            System.out.println("du 18");
        }
    }

    public boolean check18(){
        String[] arr = getNgaySinh().split("-");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int year = Integer.parseInt(arr[0]);
        System.out.println("Year"+year);
        if(2019 - year >= 18){
            return true;
        }
        return false;

    }
}
