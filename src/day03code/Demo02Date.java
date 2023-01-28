package day03code;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    private static void demo01(){
        Date a = new Date();
        System.out.println(a);
    }

    private static void demo02(){
        Date a = new Date(0L);
        System.out.println(a);
    }

    private static void demo03(){
        Date a = new Date();
        long time = a.getTime();
        System.out.println(time);
    }
}
