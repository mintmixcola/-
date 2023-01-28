package cn.itcast.day06;

public class Person {
    String name;
    private int age;

    public void setAge(int num){
        if (num >= 0 && num < 100){
            age = num;
        }else {
            System.out.println("输入不合法");
        }
    }

    public int getAge(){
        return age;
    }
}
