package cn.itcast.day072;

import java.util.ArrayList;
import java.util.Random;

//生成6个一到33的随机整数，添加到集合，并遍历集合。
public class test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            int a = r.nextInt(32)+1;
            list.add(a);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
