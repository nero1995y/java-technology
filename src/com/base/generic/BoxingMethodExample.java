package com.base.generic;

public class BoxingMethodExample {
    public static void main(String[] args) {

        Box<Integer> box1 = Util.<Integer>boxting(100);

        int value = box1.get();

        Box<String> box2 = Util.<String>boxting("아이유");

        String value2 = box2.get();

        System.out.println(value);
        System.out.println(value2);

    }
}
