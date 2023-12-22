package com.ohgiraffers.section01.usertype;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        /* 1. 변수와 배열을 이용한 회원 데이터 관리 */

        String id = "user01";
        String pwd = "pass01";
        String name = "다람쥐";
        int age = 900;
        char gender = '무'; // char = 무
        String[] phone = new String[]{"010", "1234", "5678"};

        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.print("phone : ");
        for (int i = 0; i < phone.length; i++) {
            System.out.print(phone[i] + " "); // println = print all in different lines
        }
//        System.out.println(Arrays.toString(phone));
//        for (String p : phone) {
//            System.out.println(p + " ");
//        }
        System.out.println();

        /*
         * [변수와 배열로만 데이터를 관리할 때의 한계]
         * 1. 변수명을 일일이 관리해야 하는 어려움
         * 2. 모든 회원 정보를 인자로 넣어 메소드를 호출해야 할 때, 너무 많은 값을 인자로 넘겨야 하므로 가독성 저하
         * 3. return은 1개의 값만 가능하므로, 회원 정보를 묶어서 반환받아야 할 때 반환 불가
         * */

        /* 2. 사용자 정의 자료형 (=Class) 사용한 회원 데이터 관리 */
        /* 2-1. 변수 선언 및 객체 생성 */
        /* [객체(object) 생성 구문]
         * 클래스명 변수명 = new 클래스명();
         *
         * [객체 생성]
         * 사용자 정의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap영역에 할당해야 한다.
         * 객체를 생성하면 클래스에 정의한 필드와 메소드를 가진 객체(instance)가 만들어진다.
         * */

        Member member = new Member(); // 객체 생성 create a new object >> heap에다가 Member의 공간을 쓴다
        // Member의 주소값이 >> member

        /* 2-2. 생성된 인스턴스의 초기값 확인 */
        /*
        /* [필드 (속성)에 접근하는 방법]
         * 레퍼런스변수명.필드명
         *
         * 참조 연산자 '.' 은 레퍼런스 변수가 참고하고 있는 주소로 접근하는 의미를 가진다.
         * 각 변수 공간에는 필드명으로 접근할 수 있다. (cf. 배열은 index를 통해 접근)
         * */
        System.out.println("member의 id 초기값 : " + member.id);
        System.out.println("member의 pwd 초기값 : " + member.pwd);
        System.out.println("member의 name 초기값 : " + member.name);
        System.out.println("member의 age 초기값 : " + member.age);
        System.out.println("member의 gender 초기값 : " + member.gender);
        System.out.println("member의 phone 초기값 : " + member.phone);

        /* 2-3. 필드에 접근하여 변수처럼 사용 (값 대입) */
        member.id = "user02";
        member.pwd = "pass02";
        member.name = "원숭이";
        member.age = 40;
        member.gender = '남';
        member.phone = new String[] {"010", "8765", "4321"}; // null을 끊을려면 새로운 값을 입력을 해야하기 때문에 new 작성

        System.out.println("값 대입 후 id : " + member.id);
        System.out.println("값 대입 후 pwd : " + member.pwd);
        System.out.println("값 대입 후 name : " + member.name);
        System.out.println("값 대입 후 age : " + member.age);
        System.out.println("값 대입 후 gender: " + member.gender);
        System.out.print("값 대입 후 phone : ");
        for(int i = 0; i < member.phone.length; i++) {
            System.out.print(member.phone[i] + " ");
        }
        System.out.println();

    }
}
