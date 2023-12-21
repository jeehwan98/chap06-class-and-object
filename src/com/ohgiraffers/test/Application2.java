package com.ohgiraffers.test;

public class Application2 {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "뽀삐";
        dog1.age = 1;
        printDog(dog1); // what is printDog..?

        Dog dog2 = new Dog();
        dog2.name = "바둑이";
        dog2.age = 12;
        printDog(dog2);

        Dog dog3 = new Dog();
        dog3.name = "알렉산더 3세";
        dog3.age = 3;
        printDog(dog3);

        }
    public static void printDog(Dog dog) {
        System.out.println("우리 집 " + dog.animalType + "는 복슬강아지");
        System.out.println("이름은 " + dog.name + "이고요.");
        System.out.println(dog.age + "년이나 살았답니다~");

    }

}
