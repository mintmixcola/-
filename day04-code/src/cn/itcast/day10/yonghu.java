package cn.itcast.day10;
//群主发普通红包。某群有多名成员，群主给成员发普通红包。普通红包的规则：
//群主的一笔金额，从群主余额中扣除，平均分为n等分，让成员领取。
//成员领取红包后，保存到成员余额中。
public abstract class yonghu {
    private String name;
    private int  money;

    public yonghu(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public yonghu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public void show(){
        System.out.println("名字"+name+"我有："+money);
    }
}
