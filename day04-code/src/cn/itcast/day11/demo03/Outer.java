package cn.itcast.day11.demo03;

public class Outer {
    int num = 10;
    public class Inner{
        int num = 20;

        public void sss(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
