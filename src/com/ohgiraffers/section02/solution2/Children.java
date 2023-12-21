package com.ohgiraffers.section02.solution2;

public class Children {
    public static void main(String[] args) {

    }

    /*
    * [접근제한자]
    * 클래스 혹은 클래스의 멤버에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
    * (+) public : 모든 패키지에서 접근 허용
    * (#) protected : 동일 패키지에서 접근 허용 (단, 상속 관계에 있는 경우 다른 패키지에서도 접근 가능)
    * (~) default : 동일 패키지 내에서만 접근 허용.
    * )-) private : 해당 클래스 내부에서만 접근 허용
    *
    * 위 네 가지 접근제한자는 클래스, 생성자, 클래스의 멤버(필드,메소드)에 모두 사용 가능하다.
    * 단, 클래스 선언 시 사용하는 접근제한자는 public과 default만 사용 가능하다. */


    // 언급 X = default
    private String name; // nickname으로 바꾸면  >> 다 바꿔야한다...
    private int age;

    public void setInfo(String info){
        this.name = info;
    }
    public void setProperty(int property) {
        if(property >= 0) {
            this.age = property;
        }
        else {
            System.out.println(this.name + " 어린이의 나이를 비정상적으로 입력하였습니다.");
            this.age = 0;
        }

    }
    public String getChildren() {
        return "놀고 있는 어린이 : " + this.name + "(" + this.age + ")";

    }
}
