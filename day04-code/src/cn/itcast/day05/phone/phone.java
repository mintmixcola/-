package cn.itcast.day05.phone;

public class phone {
    String brand;
    double price;
    String name;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public  void  messge(String brand,double price,String name){
        System.out.println("给"+name+"打电话");
        System.out.println("价格为"+price);
        System.out.println("品牌名"+brand);

    }
}
