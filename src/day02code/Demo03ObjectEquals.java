package day02code;

import java.util.Objects;

public class Demo03ObjectEquals {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = null;

//        s2.equals(s1);//s2为空，空指针不能调用方法，会抛出空指针异常
        boolean b2 = Objects.equals(s1, s2);
        boolean equals = Objects.equals(s2, s1);
        System.out.println(equals);
    }

}
