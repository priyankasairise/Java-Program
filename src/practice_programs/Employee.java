package practice_programs;

 class Employee {
     float Salary=40000;
}
class Programmer  extends Employee{
    int Bonus = 10000;
    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println(p.Salary);
        System.out.println(p.Bonus);


    }
}
