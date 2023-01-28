package cn.itcast.day08;

import java.util.Scanner;

//键盘输入一个字符串，并统计各个字符出现的次数。
public class test802 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        tongji(s);
    }
    public static void tongji(String a){
        char[] chars = a.toCharArray();
        int countUper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] <= 'Z' && chars[i] >= 'A'){
                countUper++;
            }
            else if(chars[i] >= 'a' && chars[i] <= 'z'){
                countLower++;
            }
            else if(chars[i] >= '0'&&  chars[i] <+ '9'){
                countNumber++;
            }
            else {
                countOther++;
            }
        }
        System.out.println("大写字母："+countUper);
        System.out.println("小写字母："+countLower);
        System.out.println("数字："+countNumber);
        System.out.println("其他符号："+countOther);
    }
}
