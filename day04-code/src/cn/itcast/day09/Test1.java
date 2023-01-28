package cn.itcast.day09;

import java.util.Arrays;

//使用Arrays相关API，将一个随机数组进行升序排序，并且倒序打印。
public class Test1 {
    Test1(){
        String a = "hfadhoisjxnkhiw461";
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i  > 0; i--) {
            System.out.println(chars[i]);
        }
    }

    public static void main(String[] args) {
        Test1 one = new Test1();
    }
}
