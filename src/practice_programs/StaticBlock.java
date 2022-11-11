package practice_programs;

import java.awt.desktop.ScreenSleepEvent;

public class StaticBlock {
    static {
        System.out.println("I am from static Block");
    }
    {
        System.out.println("I am from Instance Block");
    }
    StaticBlock(){
        System.out.println("I am from Constructor");
    }
    public static void main(String[] args) {
        //StaticBlock t1=new StaticBlock();
    }
}
