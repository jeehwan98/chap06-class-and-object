package com.ohgiraffers.test;

public class Person {

    String name;        // 이름
    int age;            // 나이
    private String eyeColor;    // 눈동자색
    double height;      // 키
    String nationality; // 국적
    double feetSize;    // 발 사이즈
    String phoneNumber; // 휴대폰번호

    // eyeColor 필드의 값을 검증하여 설정하는 기능을 하는 메소드
    public void setEyeColor(String eyeColor) {
        String[] eyeColorSample = {"검정", "갈색", "파랑", "노랑", "회색", "초록", "보라"};

        for (int i = 0; i < eyeColorSample.length; i++) {
            if (eyeColor.equals(eyeColorSample[i])) {
                this.eyeColor = eyeColor;
                return; //learn how to use the eyecolor // return을 했기 때문에 맨 위로 "정상적인 흥채색이 아닙니다" 를 출력 한다..
                // if eyecolor != then print out "정상적인 홍채색이 아닙니다"
            }
        }
        System.out.println("정상적인 흥채색이 아닙니다");
        return;
    }
    public String getEyeColor() {
        return this.eyeColor = eyeColor; // 왜 return this.eyeColor
    }
}