package cn.itcast.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        //首先创造一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        USB mouse = new Mouse();
        computer.useDevice(mouse);

        //准备一个键盘，供电脑使用
        USB keyBoard = new Keyboard();
        computer.useDevice(keyBoard);
    }
}
