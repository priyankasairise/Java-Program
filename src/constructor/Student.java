package constructor;

public class Student {
    int id;
    String name;
    int age;
    String gender;

    Student(int id,String name,int age,String gender)
    {
    this.id=id;
    this.name=name;
    this.age=age;
    this.gender=gender;
    }

    public static void main(String[] args) {
        Student s= new Student(101,"Mahesh",14,"Male");
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.gender);
    }
}
