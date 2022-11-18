package multipleThreading;
//This code is not recommend
public class ThreadDemo7 {
    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0;i<=10;i++){
                System.out.println("Java");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(()->{
            for(int i=0;i<=10;i++){
                System.out.println("Android");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);
                }
            }
        }).start();


    }
}
