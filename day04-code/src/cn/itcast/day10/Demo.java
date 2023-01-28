package cn.itcast.day10;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        qunzhu a = new qunzhu("群主",100);
        a.show();
        qunchengyuan one  = new qunchengyuan("成员1",0);
        qunchengyuan two  = new qunchengyuan("成员2",0);
        qunchengyuan three  = new qunchengyuan("成员3",0);
        one.show();
        two.show();
        three.show();
        ArrayList<Integer> arrayList = a.send(3,20);
        a.show();
        one.receive(arrayList);
        two.receive(arrayList);
        three.receive(arrayList);
        one.show();
        two.show();
        three.show();
    }
}
