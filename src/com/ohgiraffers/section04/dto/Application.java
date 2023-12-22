package com.ohgiraffers.section04.dto;

public class Application {

    public static void main(String[] args) {

        /*
        * 생성자를 이용한 초기화와 설정자를 이용한 초기화는 각각의 장단점이 있다.
        * 1. 생성자를 이용한 초기화
        *   - 장점: setter 메소드를 여러 번 호출해서 사용하지 않고 단 한번의 호출로 인스턴스를 생성 및 초기화를 할 수 있다
        *   - 단점: 필드를 초기화할 때 매개변수의 갯수를 경우의 수 별로 모두 만들어두어야 한다.
        *           호출 시 인자가 많아지는 경우 어떤 값이 어떤 필드응 의미하는지 한눈에 보기 힘들다
        * 2. 설정자를 이용한 초기화
        *   - 장점: 필드를 초기화하는 각각의 값들이 어떤 필드를 초기화하는지 명확하게 볼 수 있다.
        *   - 단점: 하나의 인스턴스를 생성할 때 한번의 호출로 끝낼 수 없다.
        * */

        /* 1.생성자를 이용한 초기화 */ // constructor
        UserDTO user1 = new UserDTO("user01", "pass01", "남윤진", new java.util.Date());
        System.out.println(user1.getInformation());

        /* 2. 설정자를 이용한 초기화 */ //setter
        UserDTO user2 = new UserDTO();
        user2.setID("user02");
        user2.setPwd("pass02");
        user2.setName("남윤진");
        user2.setEnrollDate(new java.util.Date());
        System.out.println(user2.getInformation());
        // easy to visualize

    }
}
