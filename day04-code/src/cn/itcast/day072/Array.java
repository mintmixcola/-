package cn.itcast.day072;
//创建一个数组，数组存放Person类
public class Array {
    public static void main(String[] args) {
        Person one = new Person("a",15);
        Person two = new Person("b",5);
        Person three = new Person("c",1);

        Person[] ar = new Person[3];

        ar[0] = one;
        ar[1] = two;
        ar[2] = three;

        System.out.println(ar[1]);
        System.out.println(ar[0].getName());
        System.out.println(ar[1].getName());
        System.out.println(ar[2].getName());
    }

}
