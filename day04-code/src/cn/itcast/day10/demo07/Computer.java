package cn.itcast.day10.demo07;

public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public  void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){//一定要判断
            Mouse mouse = (Mouse)usb;//向下转型
            mouse.click();
        }
        else if(usb instanceof  Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }

        usb.close();
    }
}
