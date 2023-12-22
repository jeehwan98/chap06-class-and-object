package com.ohgiraffers.test;

public class Application {

    public static void main(String[] args) {

        /* 남윤진(900세)
         * 눈동자 : 검정
         * 키 : 175cm
         * 국적 : 한국
         * 전화번호 : 01076569003
         * 발 사이즈 : 265mm
         *  */
        /* 사람의 정보를 가지고 사람을 만들어 보자! */

        /*
         * 1. 리터럴(= 데이터 자체)로 값을 사용
         *   수정사항이 생기면 값을 사용하는 곳에서 값을 모두 바꿔줘야 한다. (3명 * 7개 속성 * 3곳 = 63번의 수정)
         *   즉, 수정사항이 발생했을 때 영향범위가 넓고, 값을 직접 사용하기 때문에 수정 시 오타가 발생할 확률이 높다.
         *   또한 값 자체만 놓고 봤을 때 어떤 의미를 가지는 값인지 알 수 없다.
         *       그래서 우리는 '변수'를 사용한다.
         * */

        /*
         * 2. 변수를 사용
         *   수정사항이 생기면 값을 수정할 범위가 위 1에 비해 줄어들었다. (3명 * 7개 속성 * 변수 1곳 = 21번의 수정)
         *   변수의 이름을 정하기 때문에, 해당 변수에 담긴 값이 어떤 것을 의미하는지 알 수 있다. */


        /* 3. 메소드를 사용
         *   코드 여러 줄이 반복되는 경우 코드 내용을 수정할 때 오타 발생 가능성이 높고
         *   수정사항이 발생할 대 (예를 들어, 출력문에서 name1 변수 대신 nickname1을 출력해야 할 때 등)
         *   코드 여러 줄을 수정해야 한다. 또한 동일 코드가 반복되면 가독성이 떨어진다.
         * => 그래서 우리는 '메소드'를 사용한다.
         *   코드를 반복해서 사용할 때 (3명의 정보 * 정보를 출력하는 구문 7줄 * 3곳 = 코드 63줄 작성)
         *   메소드를 사용할 때 (3명의 정보 * 정보를 출력하는 구문 7줄 = 코드 21줄 작성) */

        /* 4. 배열을 사용 (할 수도 있기는 있다..)
         *   하나의 자료형에 대해서 여러 개의 값을 관리할 수 있다.
         *   지금처럼 서로 다른 자료형을 묶어서 관리하는 것을 불가능하다.
         *   => 그래서 사용자 정의 자료형인 클래스를 사용할 것이다. */

        //객체 새로 생성
        Person person1 = new Person();

        person1.name = "남윤진";
        person1.age = 900;
        person1.setEyeColor("떡볶이"); // person1.eyeColor = "검정"; // >> person1.setEyeColor("검정")
        person1.height = 175;
        person1.nationality = "한국";
        person1.phoneNumber = "01076569003";
        person1.feetSize = 26.5;

        Person person2 = new Person();
        person2.name = "신혜선";
        person2.age = 31;
        person2.setEyeColor("갈색"); // = "갈색"; // >> person2.setEyeColor("떡뽁이"); 로 바뀌면..? // eyeColor의 색을 검증을 하기 위해서 쓰는 것이다.!
        person2.height = 177;
        person2.nationality = "한국";
        person2.phoneNumber = "01076569003";
        person2.feetSize = 27.0;

        Person person3 = new Person();
        person3.name = "남윤진";
        person3.age = 29;
        person3.setEyeColor("파란색"); // "파란색"; // >> person3.setEyeColor("파란색")
        person3.height = 164;
        person3.nationality = "미국";
        person3.phoneNumber = "0103920231";
        person3.feetSize = 23.0;

        /* 객체로 담았기 때문...!!*/

//  all datas have different types ... which is why we can't use array
//  여기에 입력이 돼있는 값은 다른 method에서 쓸 수 없음. // 값 입력 //

        System.out.println("======== 주민등록된 사람 ========");
        printPeople(person1, person2, person3);
        System.out.println("======== 가족관계에 등록된 사람 ========");
        printPeople(person1, person2, person3);
        System.out.println("======== 회사 또는 학교에 소속된 사람 ========");
        printPeople(person1, person2, person3);
    }
    public static void printPeople(Person person1, Person person2, Person person3) { /* wrote all the variables into printPeople */

        System.out.println(person1.name + "(" + person1.age + "세)");
        System.out.println("눈동자 : " + person1.getEyeColor()); //eyeColor > changed > getEyeColor
        System.out.println("키 : " + person1.height + "cm)");
        System.out.println("국적 : " + person1.nationality);
        System.out.println("전화번호 : " + person1.phoneNumber);
        System.out.println("발 사이즈 : " + person1.feetSize + "cm");
        System.out.println();

        System.out.println(person2.name  + "(" + person2.age + "세)");
        System.out.println("눈동자 : " + person2.getEyeColor()); //eyeColor > changed > getEyeColor
        System.out.println("키 : " + person2.height + "cm");
        System.out.println("국적 : " + person2.nationality);
        System.out.println("전화번호 : " + person2.phoneNumber);
        System.out.println("발사이즈 : " + person2.feetSize + "cm");
        System.out.println();

        System.out.println(person3.name + "(" + person3.age + "세)");
        System.out.println("눈동자 : " + person3.getEyeColor()); //eyeColor > changed > getEyeColor
        System.out.println("키 : " + person3.height + "cm");
        System.out.println("국적 : " + person3.name);
        System.out.println("전화번호 : " + person3.phoneNumber);
        System.out.println("발사이즈 : " + person3.feetSize + "cm");
    }
}
