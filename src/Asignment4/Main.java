package Asignment4;

public class Main {
    public static void main(String[] args) {
        product pr1 = new product();
        pr1.inputInfo();
        pr1.showInfo();
        pr1.checkqty();

        cart cart = new cart();
        cart.inputInfo();
        cart.showInfo();
    }
}
