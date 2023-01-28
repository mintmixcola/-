package cn.itcast.day08;

public class StringMethod {
    public static void main(String[] args) {
        String  str1= "操你妈 你玩的什么玩意儿";
        System.out.println("输入框字符串："+str1);
        String s = str1.replace("操你妈", "***");
        System.out.println("修改后字符串:"+s);

    }
}
