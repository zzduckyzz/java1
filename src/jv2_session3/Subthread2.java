package jv2_session3;

public class Subthread2 implements Runnable {

    @Override
    public void run() {
        for (int i=0 ; i<100 ; i++){
            try {
                System.out.println("Sub2..."+i);
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }
}
