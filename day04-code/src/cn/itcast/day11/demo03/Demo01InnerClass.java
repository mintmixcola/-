package cn.itcast.day11.demo03;

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body("a");//外部类的对象
        //通过外部类的对象，调用外部类的方法，里面间接使用内部类Heart
        body.methodBody();
        System.out.println("============");

        //按照公式写
        Body.Heart heart = new Body("b").new Heart();
        heart.beat();
    }
}
