package cn.itcast.day04.damo02;

public class Demo02Method {
    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMethod();
    }

}
