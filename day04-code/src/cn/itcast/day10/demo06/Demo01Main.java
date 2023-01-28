package cn.itcast.day10.demo06;

public class Demo01Main {
    public static void main(String[] args) {
        Animal one = new Cat();
        one.eat();

        Cat cat = (Cat) one;
        cat.jineng();

    }
}
