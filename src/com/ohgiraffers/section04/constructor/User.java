package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {
                                                // field //
    private java.util.Date enrollDate;  // 필드로 다른 클래스 자료형도 사용할 수 있다.
    private String id; // private String id = field
    private String pwd;
    private String name;


    /*
     * [생성자의 작성 위치]
     * 작성 위치는 문법상으로는 클래스 내부에만 작성하며 되지만
     * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다. ///////////////////////알아보기////////////////////////////
     *
     * [생성자 사용 목적]
     * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
     * 2. 매개변수가 있는 생성자의 경우, 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주로 사용한다. ***다시 보기***
     * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않으므로, 인스턴스 생성 방법을 제한할 목적으로 쓸 수 있다. *****중요*****
     *   (초기값 전달 강제화)
     *
     * [생성자 작성 방법]
     * 접근제한자 클래스명(매개변수)
     *       인스턴스 생성 시점에 수행할 명령 기술 (주로 필드 초기화)
     *       this.필드명 = 매개면수
     *
     * [생정자 작성 시 주의할 점]
     * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다. (대소문자까지 같아야 한다!)
     * 2. 생성자 메소드는 반환형을 작성하지 않는다. (작성 시 생성자가 아닌 메소드로 인식한다.)
     *
     * [생성자의 종류]
     * 1. 기본 생성자 (매개변수가 없는 생성자)
     * 2. 매개변수가 있는 생성자
     * 기본 생성자는 자바 컴파일러가 자동으로 추가해주는 구문이지만, 명시적으로 작성할 수 있다.
     * 매개변수가 있는 생성자가 한 개라도 존재하는 경우, 기본 생성자를 자동으로 추가해주지 않으므로
     * 기본 생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.
     *  */

    /* 기본 생성자 */
    public User() { // overload
        System.out.println("User 클래스의 기본 생성자 호출됨.");
    }

    /* 매개변수 있는 생성자 */
    public User(String id, String pwd, String name) { // 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
        this.id = id;
        this.pwd = pwd;
        this.name = name; // id, pwd, name 초기화

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출된");

    }
                                                // 메소드 //
    public String getInformation() {
        return "User [id = " + this.id + ", pwd = " + this.pwd + ", name = " + this.name + ", enrollDate = " + this.enrollDate + "]";
    }

    /* 모든 필드를 초기화하는 생성자 (= 모든 필드(id, pwd, name, enrollDate))를 초기화할 값을 매개변수로 받는 생성자. */

    public User(String id, String pwd, String name, java.util.Date enrollDate) {
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;

        /*
         * this()는 동일한 클래스 내에 작성한 다른 생성자를 호출하는 구문이다.
         * 괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다. (메소드와 작동방식 동일)
         * 리턴되어 돌아오지만 리턴 값은 존재하지 않는다.
         * this()는 가장 첫 줄에 선언해야 하며, 그렇지 않으면 컴파일 에러가 발생한다.
         * */
        this(id, pwd, name);
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출됨");
    }

    /* 복사 생성자 */
    /* 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드 값을 이용해서 새로운 인스턴스 생성 시 초기화 값으로 이용할 수 있다.
    * 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로 다른 주소값을 가지게 된다. (깊은 복사) */

    public User(User otherUser) {
//        this.id = otherUser.id;
//        this.pwd = otherUser.pwd;
//        this.name = otherUser.name;
//        this.enrollDate = otherUser.enrollDate;

        this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);

        System.out.println("User 클래스의 복사 생성자 호출됨");
        System.out.println("this hashCode() : " + this.hashCode());
        System.out.println("otherUser hashCode() : " + otherUser.hashCode());
    }
}
