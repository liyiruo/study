package main.java.com.线程.thread.threadINS;

public class NoNameInnerClassThread {
    public static void main(String[] args) {
/*

        new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("hhhh"+i);
                }

            }
        };
*/

        //*********
        Runnable runnable=new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 20; i++) {
                    System.out.println("hhhh ："+i);
                }
            }
        };
        new Thread(runnable).start();
    }
}
