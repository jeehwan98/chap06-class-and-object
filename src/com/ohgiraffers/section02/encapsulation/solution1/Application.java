package com.ohgiraffers.section02.encapsulation.solution1;

import com.ohgiraffers.section02.encapsulation.solution1.Children;

public class Application {

    public static void main(String[] args) {

        Children child1 = new Children();
        child1.setName("심민섭");
        child1.setAge(2);

        Children child2 = new Children();
        child2.setName("김청희");
        child2.setAge(6);

        Children child3 = new Children();
        child3.setName("김현지");
        child3.setAge(-8);


        System.out.println("놀고있는 어린이1 : " + child1.getName() + "(" + child1.age + "세)");
        System.out.println("놀고있는 어린이2 : " + child2.getName() + "(" + child2.age + "세)");
        System.out.println("놀고있는 어린이3 : " + child3.getName() + "(" + child3.age + "세)");

    }
}
