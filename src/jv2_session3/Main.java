package jv2_session3;

public class Main {
    public static void main(String[] args) {
//        Subthread1 s1 = new Subthread1();

        MyThread m1 = new MyThread();
        System.out.println(m1.getName());
        m1.setName("My Thread");
        m1.start();


        Subthread2 s2 = new Subthread2();
        Thread t1 = new Thread(s2);
        t1.setName("runable...");
        t1.start();

//        Runnable r1 = ()->{
//                System.out.println("lambda expression");
//        };
//        Thread t2 = new Thread(r1);
//        t2.start();

//        Runnable r2 = new Runnable() {
////            @Override
////            public void run() {
////                System.out.println(" no lambda expression");
////            }
////        };

//        for(int i=0;i<100;i++){
//            try {
//                System.out.println("Main thread.."+i);
//                Thread.sleep(1000);
//            }catch (Exception e){
//
//            }
//        }
////        s1.start();

    }
}
