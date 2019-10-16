package lab5s;

import java.util.Scanner;

public class Person {
    public String Ten;
    public String GioiTinh;
    public String NgaySinh;
    public String DiaChi;

    public Person(){
        inputInfo();
        showInfo();
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        Ten = ten;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        setTen(sc.nextLine());
        System.out.println("Nhap gioi tinh");
        setGioiTinh(sc.nextLine());
        System.out.println("Nhap ngay sinh");
        setNgaySinh(sc.nextLine());
        System.out.println("Nhap dia chi");
        setDiaChi(sc.nextLine());

    }

    public void showInfo(){
        System.out.println("Nhap ten"+getTen());
        System.out.println("Nhap gioi tinh"+getGioiTinh());
        System.out.println("Nhap ngay sinh"+getNgaySinh());
        System.out.println("Nhap dia chi"+getDiaChi());

    }
}
