package cn.itcast.day09;

public class Person {
    static {
        System.out.println("静态方法执行了！");
    }

    Person(){
        System.out.println("构造方法执行了！");
    }

}
