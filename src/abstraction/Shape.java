package abstraction;

import java.util.Scanner;

abstract class Shape {
   public void displayInfo(){
System.out.println("I am from shape class");
    }
   public abstract void findarea();{

    }
    static class square extends Shape{
       public void findarea(){
           System.out.println("Area of Square is::\n");
           Scanner sc = new Scanner(System.in);
           int side=sc.nextInt();
           System.out.println("Area of side is:" +(side*side));
       }
   }
   static class Triangle extends Shape{
       @Override
       public void findarea() {
           System.out.println("Area of triangle is::\n");
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the breadth value ::\n");
           int b= sc.nextInt();
           System.out.println("enter the height value::\n");
           int h= sc.nextInt();
           System.out.println("Area of Triagle is:"+(0.5*b*h));
       }
   }
   static class Circle extends Shape{
       @Override
       public void findarea() {
           System.out.println("Area of Circle is::\n");
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the radius value::\n");
           int radius= sc.nextInt();
           double PI=3.14;
           System.out.println("Area of circle"+(PI*radius*radius));
       }
   }
   public static class AbstractionTest{
       public void area(Shape s){
           s.displayInfo();
           s.findarea();
       }

       public static void main(String[] args) {
           AbstractionTest at1= new AbstractionTest();
//           at1.area(new square());
           at1.area(new Triangle());
           at1.area(new Circle());
       }
   }

}
