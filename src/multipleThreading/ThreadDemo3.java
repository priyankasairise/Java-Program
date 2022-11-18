package multipleThreading;

/*class java implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("Java");
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);
            }
        }

    }
}

class Android implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("Android");
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        Runnable r1=new java();
        Runnable r2=new Android();

        Thread thread1=new Thread(r1);
        Thread thread2=new Thread(r2);

        thread1.start();
        try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);
        }
        thread2.start();

    }
}*/