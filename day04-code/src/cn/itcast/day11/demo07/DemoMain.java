package cn.itcast.day11.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("亚索");
        h.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("斩钢闪");
            }
        });
        h.attack();
    }
}
