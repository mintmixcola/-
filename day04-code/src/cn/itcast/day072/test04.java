package cn.itcast.day072;

import java.util.ArrayList;
import java.util.Random;

//要求随机生成20个数，从中挑出偶数并放到小集合中，
//（要求用自定义的方法？）
public class test04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt();
            list.add(num);
        }


        for (int i = 0; i < 20; i++) {
//            Integer integer = list.get(i);
//            int a = integer;
            int a = list.get(i);
            if(a%2 == 0){
                list2.add(a);
            }
            else {
                continue;
            }
        }

        System.out.println(list2);
    }
}
