package com.designPattern.creational;

public class Main {
    public static void main(String[] arg){

        User user =  User.builder()
                .name("simso")
                .age(27)
                .height(170)
                .iq(100)
                .build();

        System.out.println(user.toString());


//        객체 생성이 되는 순간에 값 setting을 모두 하기 때문에 변경 불가능한(immutable) 객체를 만들 수 있음(변경 불가능하기 때문에 final로 프로퍼티 선언을 함)
//        한 번에 객체 생성이 가능
//        build()함수로 잘못된 값이 셋팅되었는지 검증 가능

    }
}
