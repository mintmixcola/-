package day02code;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("大谷",18);
        Person p2 = new Person("迪迦",2000);
        boolean equals = p1.equals(p2);
        System.out.println(equals);
    }
}
