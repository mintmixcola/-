package cn.itcast.day072;

import java.util.ArrayList;

//以指定格式打印ArrayList。 形如{ @, @, @, @, @}
public class test02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("梦比优斯");
        list.add("高斯");
        list.add("迪迦");
        list.add("泰罗");

        for (int i = 0; i < list.size(); i++) {
            if(i == 0){
                System.out.print("{"+list.get(i)+"@,");
            }
            else if(i == list.size()-1){
                System.out.print(list.get(i)+"@}");
            }
            else {
                System.out.print(list.get(i)+"@,");
            }
        }
    }
}
