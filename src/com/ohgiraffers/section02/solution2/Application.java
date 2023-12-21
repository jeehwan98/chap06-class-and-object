package com.ohgiraffers.section02.solution2;

public class Application {

    public static void main(String[] args) {

        Children child1 = new Children();
//        child1.name = "최승욱"; // private access == 접근 불가
        child1.setInfo("최승욱");
        child1.setProperty(4);

        Children child2 = new Children();
        child2.setInfo("김지환");
        child2.setProperty(-8);

        Children child3 = new Children();
        child3.setInfo("받다은");
        child3.setProperty(3);

        System.out.println(child1.getChildren());
        System.out.println(child2.getChildren());
        System.out.println(child3.getChildren());
    }
}
