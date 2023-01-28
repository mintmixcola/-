package cn.itcast.day11.demo05;

public class DemoMain {
    public static void main(String[] args) {
        one a = new one() {
            @Override
            public void method() {
                System.out.println("匿名对象类重写方法");
            }
        };

        a.method();

        new one() {
            @Override
            public void method() {
                System.out.println("匿名对象类重写方法");
            }
        }.method();
    }
}
