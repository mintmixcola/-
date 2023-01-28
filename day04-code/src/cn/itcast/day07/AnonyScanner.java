package cn.itcast.day07;
import java.util.Scanner;

public class AnonyScanner {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的数字是"+num);

        System.out.println("==============");
        //匿名对象作为方法的参数和返回值
        //匿名对象作为方法的参数
//        methodParm(new Scanner(System.in));


        System.out.println("==============");
        //匿名对象作为方法的返回值。
       Scanner sc =  methodReturn();
       int num2 = sc.nextInt();
        System.out.println("数字2是："+num2);
    }
    public static void methodParm(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的数字是"+num);
    }

    public static Scanner methodReturn(){

        return new Scanner(System.in);
    }

}
