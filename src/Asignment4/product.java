package Asignment4;

import java.util.Scanner;

public class product {
    public String id;
    public String productname;
    public int qty;
    public double price;

    public product(){

    }
    public product(String id, String productname,int qty,double price){


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id san pham: ");
        setId(sc.nextLine());
        System.out.println("Nhap ten san pham: ");
        setProductname(sc.nextLine());
        System.out.println("Nhap so luong san pham: ");
        setQty(sc.nextInt());
        System.out.println("Nhap gia san pham: ");
        setPrice(sc.nextDouble());

    }

    public void showInfo(){
        System.out.println("Nhap id san pham: "+id);
        System.out.println("Nhap ten san pham: "+productname);
        System.out.println("Nhap so luong san pham: "+qty);
        System.out.println("Nhap gia san pham: "+price);
    }

    public boolean checkqty(){
        if(this.getQty()>0){
            return true;}

        return false;

    }
}
