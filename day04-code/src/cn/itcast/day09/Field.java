package cn.itcast.day09;

public class Field {
    public static void main(String[] args) {
        Student one = new Student("小虎",18);
        one.setBanji("LPL");
        System.out.println("姓名："+one.getName()+",年龄："+one.getAge()+"，班级："+one.getBanji()+"，编号："
                +one.getId());

        Student two = new Student("the shy",19);
        System.out.println("姓名："+two.getName()+",年龄："+two.getAge()+"，班级："+two.getBanji()+"，编号："
                +two.getId());
    }
}
