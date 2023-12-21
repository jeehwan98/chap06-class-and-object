package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

//public class Application {

//    public static void main(String[] args) {


        /*
         * [추상화]
         * 공통된 부분을 추출하고, 공통되지 않은 부분을 제거하는 것으로 추상화의 목적은 유연성 확보이다.
         * 유연성을 확보한다는 것은 여러 곳에 적용된 수 있는 유연한 객체를 의미하므로 재사용성을 높일 수있다.
         * 객체의 재사용성이 증가하면 중복 작성되는 코드르 줄일 수있으며, 오류 발생 가능성을 감소시키고 유지보수성을 증가시킨다. */

        /*
         * < 프로그램 개요 >
         * 자동차 운전자가 자동차를 운전하는 프로그램
         *
         * < 시스템요구사항 > // 요구사항 분석..!  쉽게 이해를 할 수 있어야 하고 정확해야 한다..!
         * 1. 운전자가 시동 걸기, 엑셀을 밟기, 브레이크 밟기, 시동 끄기할 수 있다.
         * 2. 자동차는 시동 걸기, 앞으로 가기, 멈추기, 시동 끄기할 수 있다.
         * 3. 자동차는 처음에 멈춘 상태로 대기하고 있는다. (시동이 꺼져있다.)
         * 4. 운전자 시동을 건다. 이미 시동이 걸려있는 경우에는 시동을 걸 수 없다.
         * 5. 운전자가 엑섹을 밟으면 자동차는 시속 10km/h로 속력이 증가하며 앞으로 나간다.
         * 6. 자동차가 달리고 있는 중일 때 브레이크를 밟으면 속력이 0으로 줄어드면서 멈춘다.
         * 7. 브레이크를 밟을 때 자동차가 멈춰있는 상태라면 이미 멈춰있다고 알려준다.
         * 8. 운전자가 시동을 끄면 자동차는 더 이상 움직이지 않는다.
         * 9. 자동차가 달리는 중이라면 시동을 끌 수 없다.
         *
         * < 프로그램 설계 >
         * 1. 필요한 객체를 도출
         *  - 플레리어, 운전자, 자동차
         * 2. 객체 간 상호작용
         *  - 운전자가 수신할 수 있는 메시지 ( = 운전자가 해야 하는 일)
         *      1) 시동을 걸어라
         *      2) 엑셀을 밟아라
         *      3) 브레이크를 밟아라
         *      4) 시동을 꺼라
         *  - 자동차가 수신할 수 있는 메시지 ( = 자동차가 해야 하는 일)
         *      1) 시동을 걸어라
         *      2) 앞으로 가라
         *      3) 멈춰라
         *      4) 시동을 꺼라
         * 3. 커뮤니케이션 다이어그램
         *
         * 4. 클래스 설계하기 (정적 static)
         *      1) CarDriver 클래스
         *          - 속성 : 자동차 (Car 클래스)
         *          - 행위 (기능) : 시동을 걸어라, 엑셀을 밟아라, 브레이크를 밟아라, 시동을 꺼라
         *      2) Car 클래스
         *          - 속성 : 시동 상태, 현재 시속
         *          - 행위 (메소드) : 시동을 걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라
         * */

////        CarDriver driver = new CarDriver(); // driver을 지정한다. driver의 객체를 만든 것이다...!!!
//
//        Scanner sc = new Scanner(System.in); // input 정보들
//
//        // console program...
//        while(true) { // 멈출 때 까지 계속 실행
//            System.out.println("====== 운전연습 프로그램 ======");
//            System.out.println("1. 시동 걸기");
//            System.out.println("2. 엑셀 밟기");
//            System.out.println("3. 브레이크 밟기");
//            System.out.println("4. 시동 끄기");
//            System.out.println("9. 프로그램 종료");
//            System.out.print("메뉴 선택 : ");
//            int no = sc.nextInt();
//
//            switch(no) {
//                case 1 : driver.startCar(); break;
//                case 2 : driver.stepAccelerator(); break;
//                case 3 : driver.stepBreak(); break;
//                case 4 : driver.turnOffCar(); break;
//                case 9 : System.out.println("그로그램을 종료합니다."); break;
//                default: System.out.println("해당 기능은 아직 준비중입니다."); break;
//            }
//            if (no == 9) {
//                break;
//            }
//
//        }
//
//
//    }
//}
