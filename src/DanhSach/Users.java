package DanhSach;

import java.util.Scanner;

public class Users {
    public String Ten;
    public int Tuoi;
    public String CMND;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void showInfo(){
        System.out.println("Ten"+getTen());
        System.out.println("Tuoi"+getTuoi());
        System.out.println("CMND"+getCMND());
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten");
        setTen(sc.nextLine());
        System.out.println("nhap tuoi");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap CMND");
        setCMND(sc.nextLine());
    }
}


