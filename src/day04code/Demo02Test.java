package day04code;
    /*题目：请使用日期相关的API，计算出一个人已经出生了多少天*/


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo02Test {
    public static void main(String[] args) {
     //1.使用Scanner类中的方法next，获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请按照yyyy-mm-dd的格式输入你的出生日期");
        String s = sc.next();

        //2.使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//        Date date = sdf.parse(s);

        //3.把Date格式的出生日期转换为毫秒值
//        long time = date.getTime();

        //4.获取当前日期转换成毫秒值
        long time1 = new Date().getTime();

        //5.当前日期-出生日期
//        long time_c = time1 - time;

        //将long转换成天并输出
//        System.out.println(time_c/1000/60/60/24);
    }

}
