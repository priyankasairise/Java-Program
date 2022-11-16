package practice_programs;

public class BikeStaticM {
    //int cc=150;
    static int cc=140;
    //public void Speed()
    public static void Speed()        //if the method & class are static then no need to create object
    {
        System.out.println("I am from Speed method");
    }

    public static void main(String[] args) {
        /* BikeStaticM b=new BikeStaticM();
        System.out.println(b.cc);
        b.Speed();*/

        System.out.println(cc);
        Speed();
    }
}
