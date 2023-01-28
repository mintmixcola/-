package cn.itcast.day04.damo02;

public class Demo02MethodDefine {
    public static int sum(int a,int b){
        System.out.println("方法开始了");
        int result = a +b;
        return result;
    }

    public static void main(String[] args) {
        //单独调用
        sum(10,20);
        System.out.println("===========");

        //打印调用
        System.out.println(sum(10,20));
        System.out.println("===========");

        //赋值调用
        int a = sum(10,20);
        System.out.println("===========");
    }
}
