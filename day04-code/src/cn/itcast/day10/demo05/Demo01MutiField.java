package cn.itcast.day10.demo05;


public class Demo01MutiField {
    public static void main(String[] args) {
        //使用多态的写法，父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);
        //子类没有覆盖重写就是父
        //子类覆盖重写就是子
        obj.show();
    }
}
