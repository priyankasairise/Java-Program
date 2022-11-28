package multipleThreading;

public class ThreadDemo11 {
    private synchronized void printOddNumbers() throws InterruptedException {
        for(int i=1;i<=50;i++)
        {
            if(i%2!=0)
            {
                System.out.println(Thread.currentThread().getName()+":GoodMorning");
                Thread.sleep(1000);
                wait();//will suspend current thread
            }
            notify();//notify anather thread to start
        }
    }

    private synchronized void printEvenNumbers() throws InterruptedException {
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println(Thread.currentThread().getName()+":Good Evening");
                Thread.sleep(10);
                wait();//suspends the current thread

            }
            notify();//notify anather thread to start
        }
    }
    public static void main(String[] args) {
        ThreadDemo11 t11=new ThreadDemo11();
        Thread thread1=new Thread(()->{
            try {
                t11.printOddNumbers();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"odd");

        Thread thread2=new Thread(()->{
            try {
                t11.printEvenNumbers();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"even");

        thread1.start();
        thread2.start();

    }
}
