package cn.itcast.day09;
//计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
public class Test02 {
    public Test02() {
        double a = -10.8;
        double b = 5.9;
        int c = 0;

        for(;a<=0;a++){
            double v = Math.ceil(a);
            double v1 = Math.abs(a);
            if(v1 > 6 || v1 <2.1){
                ++c;
            }
        }

        for(;b<=0;b--){
            double v = Math.floor(b);
            double v1 = Math.abs(b);

            if(v1 < 2.1 || v1 > 6){
                ++c;
            }

        }

        System.out.println(c+"个");
    }

    public static void main(String[] args) {
        Test02 one = new Test02();
    }
}
