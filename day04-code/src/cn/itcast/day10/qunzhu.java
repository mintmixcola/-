package cn.itcast.day10;

import java.util.ArrayList;

public class qunzhu extends yonghu {
    public qunzhu(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int counter,int putmoney){
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(putmoney > getMoney()){
            System.out.println("钱不够");
            return arrayList;
        }
        int a = putmoney / counter;
        int b = putmoney % counter;
        for (int i = 0; i < counter-1; i++) {
            arrayList.add(a);
        }
        arrayList.add(a + b);
        super.setMoney(getMoney()-putmoney);
        return arrayList;
    }
}
