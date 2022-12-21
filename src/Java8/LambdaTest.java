package Java8;
 interface College{
     void collegeDetails();
     default void takeAdmission(){
         System.out.println("I am from admission method");
     }
 }
 class JSPM implements College{

     @Override
     public void collegeDetails() {
         System.out.println("This is JSPM college");
     }
 }

 class AISSMS implements College{


     @Override
     public void collegeDetails() {
         System.out.println("This is AISSMS college");
     }
 }


public class LambdaTest {
    public static void main(String[] args) {
        College c1 = new JSPM();
        c1.collegeDetails();
        c1.takeAdmission();

        College c2 = new AISSMS();
        c2.collegeDetails();
        c2.takeAdmission();


        College DYP = new College() {
            @Override
            public void collegeDetails() {
                System.out.println("i am from DYP College");
            }
        };
         DYP.collegeDetails();

         College ITP=()->{
             System.out.println("I am from ITP College");
         };
          ITP.collegeDetails();

    }
}
