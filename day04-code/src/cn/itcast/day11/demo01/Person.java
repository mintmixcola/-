package cn.itcast.day11.demo01;

public class Person {
    private final String name;
//    private final String name1 = "起飞";

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Person() {
        this.name = "A";
    }

    public Person(String name) {
        this.name = name;
    }
}
