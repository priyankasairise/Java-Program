package practice_programs;

public class OddEven {
    public synchronized void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0;i<=10;i++){
                if(i%2!=0){
                    System.out.println("Odd Number"+i);
                }
            }
            try {wait();
            } catch (InterruptedException e) {throw new RuntimeException(e);
            }notify();
        },"Odd");

        Thread t2 = new Thread(()->{
            for(int i=0;i<=10;i++){
                if(i%2==0){
                    System.out.println("Even Number"+i);
                }
            }
        },"Even");
        t1.start();
        t2.start();
    }

    }

