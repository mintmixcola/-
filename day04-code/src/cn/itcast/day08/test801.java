package cn.itcast.day08;
//拼接1，2，3数组成为字符串，格式：[word#word#word]
public class test801 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(fromArrayToString(array));
//        fromArrayToString(array);
    }

    public static String fromArrayToString(int[] array){
        String s = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1){
                s += "word" + array[i] + "]";
            }
            else
            {
                s +="word" + array[i] + "#";
            }
        }

        return s;

    }

}
