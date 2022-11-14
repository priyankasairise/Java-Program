package constructor;

public class Kotak extends Bank{
     //Kotak()
    Kotak(int today)
    {
        super(today);
        System.out.println("I am from Kotak Constructor ");
    }

    public static void main(String[] args) {
        Kotak k= new Kotak(07);
        System.out.println(k);
    }

    public String toString(){
        return "Sample Msg";
    }
}
