package cn.itcast.day09;

import java.util.Arrays;

public class Demo03Arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        String[] b = {"AAA","BBB","CCC"};
        String[] c = {"AAD","BBE","ACC"};
        String s = Arrays.toString(a);
        Arrays.sort(b);
        System.out.println( Arrays.toString(b));
        Arrays.sort(c);
        System.out.println( Arrays.toString(c));

    }
}
