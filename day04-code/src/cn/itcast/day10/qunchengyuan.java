package cn.itcast.day10;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Random;

public class qunchengyuan extends yonghu {
    public qunchengyuan(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> arrayList){
      int a = new Random().nextInt(arrayList.size());
      int del = arrayList.remove(a);
      super.setMoney(getMoney() + del);
    }
}
