package Asignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class cart {
    public String Id;
    public String Customer;
    public double Grandtotal;
    public ArrayList<product> productList;
    public String City;

    public cart(){
        productList = new ArrayList<>();

    }
    public cart(String id, String customer, double Grandtotal, ArrayList<product> productList, String city){

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        this.Customer = customer;
    }

    public double getGrandtotal() {
        return Grandtotal;
    }

    public void setGrandtotal(double grandtotal) {
        this.Grandtotal = grandtotal;
    }

    public String getCity() {
        return City;
    }

    public ArrayList<product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<product> productList) {
        this.productList = productList;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public void addproduct(product product){
        productList.add(product);
    }

    public void removeproduct(product product){
        productList.remove(product);
    }
    public double TongTien(){
        double TT;
        String Shipping = new String(getCity());
        if(Shipping.equals("HN") || Shipping.equals("HCM")){
            TT = getGrandtotal() + getGrandtotal()/100;
        }else{
            TT = getGrandtotal() + getGrandtotal()*2/100;
        }return TT;
    }

    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id khach hang");
        setId(sc.nextLine());
        System.out.println("Nhap ten khach hang");
        setCustomer(sc.nextLine());
        System.out.println("Nhap tong tien cho khach hang");
        setGrandtotal(sc.nextDouble());
        System.out.println("Nhap ten thanh pho");
        setCity(sc.nextLine());

    }

    public void showInfo(){
        System.out.println("khach hang" +getCustomer());
        System.out.println("Tong Tien" +TongTien());
        System.out.println("City" +getCity());
    }
}
