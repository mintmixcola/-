package cn.itcast.day06;

public class User {
    public static void main(String[] args) {
        Person a = new Person();
        System.out.println("我叫"+a.name);
        a.setAge(18);
        System.out.println("年龄"+a.getAge());
    }
}
