package practice_programs;

public class Counter {
    //Use of Static Keyword
    //int counter=0;
   static int counter=0;
    Counter(){
       counter++;
       System.out.println(counter);
    }

    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();

    }
}
