package multipleThreading;

public class GetSetName {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for (int i=0;i<=10;i++){
                System.out.println("Java");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        },"Java Thread");  //to give the name of thread

        Thread t2=new Thread(()->{
            for (int i=0;i<=10;i++){
                System.out.println("Android");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}

            }
        },"Android Thread");

        t1.start();
        try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        t2.start();

        /*t1.setName("Java Thread");
        t2.setName("Android Thread");*/
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        System.out.println("Thread Prorities:");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.setPriority(1);
        System.out.println("Java Thread Priority is "+t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Java Thread Priority is MAX  "+t1.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Java Thread Priority is NORM  "+t1.getPriority());
        t1.setPriority(Thread.NORM_PRIORITY);


        t1.join();
        t2.join();
        System.out.println("bye bye");
    }
}
