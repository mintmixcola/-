package cn.itcast.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAge(18);
        hero.setName("盖伦");

        Weanpon a=new Weanpon();
       a.setCode("多兰剑");
       hero.setWeanpon(a);
       hero.attack();
    }
}
