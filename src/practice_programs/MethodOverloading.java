package practice_programs;

public class MethodOverloading {
    public void showMsg(){
    System.out.println("I am from Showmsg");
    }

    public void showMsg(int today){
        System.out.println("I am from showMsg.."+today);
    }

    public void showMsg(float temp){
        System.out.println("I am from showMsg.."+temp);
    }


    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.showMsg();
        mo.showMsg(10);
        mo.showMsg(44.5f);

    }
}
