package com.ohgiraffers.section03.dto;

public class Application {

    public static void main(String[] args) {
        /*
         * [DTO]
         * 캡슐화의 원칙에는 일부 어긋나긴 하지만, 다른 목적을 가진 클래스와 객체를 주상화하는 기법이 있다.
         * 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의 경우이다.
         * 이러한 객체를 설계할 때는 행위가 아닌 데이터를 위주로 하며,
         * 캡슐화의 원칙을 준수하여 모든 필드를 private으로 설정해 직접 접근을 막고,
         * 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성한다.
         * private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성된다.
         * 주로 계층간 데이터를 주고 받을 목적으로 사용한다.
         *  */

        /* 1. MemberDTO 객체를 생성한다. */
        MemberDTO member = new MemberDTO();

        /* 2. 설정자 메소드(setter)를 이용하여 필드에 값을 대입한다. */
        member.setNumber(981228);
        member.setName("김지환");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(175);
        member.setWeight(75);
        member.setActivated(true);

        /* 3. 접근자 메소드(getter)를 이용하여 필드의 값에 접근해 출력한다. */
        member.getNumber();
        member.getName();
        member.getAge();
        member.getGender();
        member.getHeight();
        member.getWeight();
        member.isActivated();

        /* 여기서 출력 하기만 하면 새로 입력이 된 값을 출력할 수 있습니다. */
        /* newly inputted variables will be outputted if we sout the "get" variables */
    }
}
