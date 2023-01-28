package cn.itcast.day11.demo03;

public class Demo02Main {
    public static void main(String[] args) {
        Outer.Inner a = new Outer().new Inner();
        a.sss();
    }
}
