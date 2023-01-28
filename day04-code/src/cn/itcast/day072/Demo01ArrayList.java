package cn.itcast.day072;

import java.util.ArrayList;

public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪迦");
        list.add("雪獒侠");
        list.add("黑犀侠");
        list.add("炎龙侠");
        boolean a = list.add("迪迦");
        System.out.println("是否成功" + a);
        System.out.println(list);
        System.out.println("取第2个元素" + list.get(1));
        System.out.println(list);
        System.out.println("删除第4个元素");
        list.remove(3);
        System.out.println(list);
        System.out.println("现在ArrayList长度");
        System.out.println(list.size());

        //遍历ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
