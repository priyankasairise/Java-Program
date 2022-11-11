package practice_programs;


class PublicTest {
    private void test() {
        System.out.println("I am from public test");
    }


    public static void main(String[] args) {
    PrivateTest t=new PrivateTest();
    //t.test();

    }
}