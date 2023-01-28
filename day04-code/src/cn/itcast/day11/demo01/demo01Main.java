package cn.itcast.day11.demo01;

public class demo01Main {
    public static void main(String[] args) {
        final int num =10;
        System.out.println(num);

        final Student stu1 = new Student("高一");
        System.out.println(stu1.getName());
        stu1.setName("一哈");
        System.out.println(stu1.getName());
    }
}
