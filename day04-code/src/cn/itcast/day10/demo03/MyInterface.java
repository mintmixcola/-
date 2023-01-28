package cn.itcast.day10.demo03;

public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    @Override
    default void methodDefault() {

    }

    public  abstract  void method();
}
