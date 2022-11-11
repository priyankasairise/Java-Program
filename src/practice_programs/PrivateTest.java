package practice_programs;
class PrivateTest {
    private void test() {
       // public void test() {

        System.out.println("I am from Private Test");
    }


    public static void main(String[] args) {
        PrivateTest t=new PrivateTest();
        t.test();

    }
}




