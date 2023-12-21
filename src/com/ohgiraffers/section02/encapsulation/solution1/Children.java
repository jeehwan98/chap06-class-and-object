package com.ohgiraffers.section02.encapsulation.solution1;

public class Children {

    String name;
    int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        if(age < 0) {
            System.out.println("잘못된 나이 정보입니다.");
            this.age = 0;
        }
        else {
            this.age = age; // this의 뜻이 무엇일까
        }



    } public String getName() {
        return this.name;
    }
}
