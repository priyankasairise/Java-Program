package practice_programs;

public class InstanceBlockTest {
    //The block without name is called as Instance Block.
    {
        System.out.println("I am from Instance Block");
    }
    InstanceBlockTest()
    {
        System.out.println("I am From Constructor");
    }

    public static void main(String[] args) {
        InstanceBlockTest t= new InstanceBlockTest();
        InstanceBlockTest t1= new InstanceBlockTest();
        InstanceBlockTest t2= new InstanceBlockTest();

    }
}
