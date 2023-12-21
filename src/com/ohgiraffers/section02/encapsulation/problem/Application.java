package com.ohgiraffers.section02.encapsulation.problem;

public class Application {

    public static void main(String[] args) {

        /* <문제점 1> 필드에 올바르지 않은 값이 들어가도 통제가 불가능하다. */
        Children child1 = new Children();
        child1.name = "남윤진";
        child1.age = 7;

        Children child2 = new Children();
        child2.name = "유승제";
        child2.age = -40;

        System.out.println("놀고 있는 어린이1 : " + child1.name + " (" + child1.age + "세)");
        System.out.println("놀고 있는 어린이2 : " + child2.name + " (" + child2.age + "세)");

    }
}
