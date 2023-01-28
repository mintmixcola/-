package cn.itcast.day05.phone;

public class phone2 {
    public void pingjie(phone parm){
        System.out.println("品牌名"+parm.brand+"价格"+parm.price+"联系人"+parm.name);
    }
    public static void main(String[] args) {
        phone one = new phone();
        one.name = "乔布斯";
        one.price = 8888;
        one.brand = "苹果";
        phone2 a = new phone2();
        a.pingjie(one);
    }
}
