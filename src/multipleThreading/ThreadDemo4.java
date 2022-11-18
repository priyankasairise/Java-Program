package multipleThreading;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
            for(int i=0;i<=10;i++){
                System.out.println("Java");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);
                }
            }
            }
        };

        Runnable r2=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Android");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);

                    }
                }
            }
        };
            Thread thread1=new Thread(r1);
            Thread thread2=new Thread(r2);

           thread1.start();

            thread2.start();

    }
}
