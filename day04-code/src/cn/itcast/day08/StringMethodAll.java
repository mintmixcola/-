package cn.itcast.day08;

public class StringMethodAll {
    public static void main(String[] args) {
        String str1 = "手握日月摘星辰";
        //字符串构造方法 字符数组
        char[] str2 ={'身','前','无','人'};
        String str3 = new String(str2);
        System.out.println("输出以字符数组创建的字符串："+str3);
        //字符串构造方法 字节数组
        byte[] bytes ={97,98,99};
        String str4 = new String(bytes);
        System.out.println("输出以字符数组创建的字符串："+str4);

        //内容比较
        System.out.println(str1.equals(str2));
        //内容比较省略大小写。
        System.out.println("身前无人".equalsIgnoreCase(str3));

        //获取字符串长度
        System.out.println("字符串str1的长度是"+str1.length());
        //拼接字符串
        String s = str3.concat("我辈武夫");
        System.out.println("拼接后字符串："+s);
        //获取索引位置的单个字符
        char c = str1.charAt(4);
        System.out.println("获取的单个字符："+c);
        //查找字符位置
        int indent = str4.indexOf("b");
        System.out.println("字符位置2："+indent);

        //截取从开始到结尾
        String s1 = str1.substring(4);
        System.out.println("截取后:"+s1);
        //截取从开始到指定
        String s2 = str4.substring(2, 3);
        System.out.println("截取后:"+s2);


        //字符串转换相关方法
        //将字符串拆分为字符数组
        System.out.println("=====拆分开始=====");
        char[] chars = str1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        //获得底层字符数组
        System.out.println("======");
        byte[] bytes1 = str1.getBytes();

        String str5 = "888 999 000";
        String[] s3 = str5.split(" ");
        System.out.println(s3[0]);
        System.out.println(s3[1]);
        System.out.println(s3[2]);
    }
}
