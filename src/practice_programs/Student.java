package practice_programs;

public class Student {
    int id;
    String name;

    Student(int i, String n){
        id=i;
        name=n;
    }

    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student s1=new Student(11,"Priya");
        Student s2=new Student(12,"Kavya");

        s1.display();
        s2.display();
    }
    }

