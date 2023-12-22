package com.ohgiraffers.section04.constructor;

public class Application {

    public static void main(String[] args) {

        /*
         * 변수 선언 : 자료형 변수명;
         * 클래스명 생성 : 자료형 레퍼런스변수명;
         * 배연 선언 : 자료형[] 레퍼런스변수명; (변수명 = 레퍼런스변수명 same thing)
         * */

        /* 1. 기본생성자 호출 -> 인스턴스 생성 */
        User user1 = new User(); // an example of an instance
        System.out.println("user1의 hashCode() : " + user1.hashCode());
        System.out.println(user1.getInformation());

        /* 2. id, pwd, name을 매개변수로 전달받는 생성자 호출 -> 인스턴스 생성 */
        User user2 = new User("user01", "pass01", "남윤진");
        System.out.println(user2.getInformation());

        /* 3. 모든 필드(id, pwd, name, enrollDate)를 매개변수로 전달받는 생성자 호출 -> 인스턴스 생성 */
        User user3 = new User("user02", "pass02", "서인국", new java.util.Date()); // 왜 new.. 나중에 설명 해줌...
        System.out.println(user3.getInformation());

        /* 4. 복사 생성자 호출 -> 인스턴스 생성 */
        User user4 = new User(user3); // copy
        System.out.println(user4.getInformation());
    }
}
