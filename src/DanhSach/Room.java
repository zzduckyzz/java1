package DanhSach;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    public String TenPhong;
    public String ViTri;
    public ArrayList<Users> dsNguoiDung;

    public Room(){
        this.dsNguoiDung = new ArrayList<>();
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String viTri) {
        ViTri = viTri;
    }
    public void themNguoiDung(Users u){
        u.inputInfo();
        this.dsNguoiDung.add(u);}
    public void xoaNguoiDung(Users u){
        this.dsNguoiDung.remove(u);
        }
    public void showInfo(){
        System.out.println("TenPhong: "+this.getTenPhong() );
        System.out.println("ViTri: "+this.getViTri());

        for (Users u: this.dsNguoiDung){
            u.showInfo();
        }
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thong tin phong");
        setTenPhong(sc.nextLine());
        System.out.println("nhap vi tri");
        setViTri(sc.nextLine());
    }


}
