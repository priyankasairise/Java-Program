package Inheritance;

public class Lion extends Animal_MOverride{
    //Method Overriding Creating same method as the parent class
    public void eat(){
        System.out.println("Lion can eat Meat");
    }

    public static void main(String[] args) {
        Lion I1=new Lion(); //MOverriding
        Animal_MOverride I = new Lion(); //Upcasting
        I.eat();
    }
}
