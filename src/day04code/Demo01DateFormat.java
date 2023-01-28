package day04code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {
    method1();
    method2();
    }

    public static void method1(){
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        String format = sim.format(date);
        System.out.println(date);
        System.out.println(format);
    }


    /*注意:
    public Date parse(String source) throws ParseException
    parse方法声明了一个异常叫ParseException
            如果字符串和构造方法的模式不一样,那么程序就会抛出此异常
    调用一个抛出了异常的方法,就必须的处理这个异常,要么throws继续抛出这个异常,要么try catch自己处理*/
    public static void method2() throws ParseException {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date parse = sim.parse("4444-25-66 44-98-66");
        System.out.println(parse);
    }

}
