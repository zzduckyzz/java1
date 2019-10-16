package Sessions5;

public class Asian extends Human{
    public void sayhello(){
        super.inputInfo();
        this.inputInfo(); // this = super + extra()
        System.out.println("hello");
    }

    public void sayhello(String msg){
        System.out.println(msg);
    }

    public void sayhello(int age, String msg){

    }

}
