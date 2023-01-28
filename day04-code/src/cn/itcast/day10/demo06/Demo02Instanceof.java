package cn.itcast.day10.demo06;

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
       // Cat cat = (Cat) animal;
        //cat.jineng();

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.jineng();
        }

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.jineng();
        }

        girlAPet(new Dog());
    }

    public static void girlAPet(Animal animal){
        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.jineng();
        }

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.jineng();
        }
    }
}
