package com.ohgiraffers.section04.dto;

import com.ohgiraffers.section04.constructor.User;

public class UserDTO {

    /*
     * [Java Bean]
     * JSP에서 배우게 될 표준 액션 태그로 접근할 수 있는 자바 클래스이다.
     * 자바 코드를 모르는 퍼블리셔도 자바 코드를 사용할 수 있도록 태그 형식으로 지원하는 문법을 의미하는데,
     * 그때 사용할 수 있도록 규칙을 지정해 놓은 자바 클래스를 자바 빈이라고 부른다.
     * (결국 특정 목적에 따라 클래스를 작성하는 규칙이라고 보면 된다.)
     *
     * [Java Bean 작성 규칙]
     * 1. 자바 빈은 특정 패키지에 속해 있어야 한다. (default 패키지 금지)
     * 2. 멤버변수(필드)의 접근제어자는 private으로 선언해야 한다.
     * 3. 기본 생성자가 명시적으로 존재해야 한다. (매개변수 있는 생성자는 선택적으로 추가)
     * 4. 모든 멤머변수에 접근 가능한 설정자(setter)와 접근자(getter)가 public으로 작성되어야 한다.
     * 5. 직렬화(Serializable 구현)가 되어야 한다. (선택적)
     * */

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public UserDTO() { // 기본 생성자
    }
    public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.enrollDate = enrollDate;
    }

//  setter
    public void setID(String id) {
        this.id = id;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEnrollDate(java.util.Date enrollDate) {
        this.enrollDate = enrollDate;
    }

//  getter
    public String getId() {
        return this.id;
    }
    public String getPwd() {
        return this.pwd;
    }
    public String getName() {
        return this.name;
    }
    public java.util.Date getEnrollDate() {
        return this.enrollDate;
    }

    public String getInformation() {
        return "UserDTO [id = " + this.id + ", pwd = " + this.pwd + ", name = " + this.name + ", enrollDate " + enrollDate + "]";
    }
}
