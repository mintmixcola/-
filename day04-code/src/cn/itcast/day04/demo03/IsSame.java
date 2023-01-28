package cn.itcast.day04.demo03;
//判断两个数是否相等
public class IsSame {
    public static boolean Same(int a,int b){
        return a == b;//1.if else 2.a==b?true:false; 3.boolean s = a==b;
    }

    public static void main(String[] args) {
        System.out.println(Same(20,20));
    }
}
