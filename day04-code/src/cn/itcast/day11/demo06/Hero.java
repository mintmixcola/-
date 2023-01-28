package cn.itcast.day11.demo06;

public class Hero {
    private String name;
    private int age;
    private Weanpon weanpon;

    public Hero(String name, int age, Weanpon weanpon) {
        this.name = name;
        this.age = age;
        this.weanpon = weanpon;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weanpon getWeanpon() {
        return weanpon;
    }

    public void setWeanpon(Weanpon weanpon) {
        this.weanpon = weanpon;
    }

    public void attack(){
        System.out.println("英雄"+name+"年龄"+age+"在用"+weanpon.getCode()+"攻击");
    }
}
