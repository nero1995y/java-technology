package com.base.instance;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Child();
        method(parent);

    }

    public static void method(Parent parent) {
        if( parent instanceof  Child) {
            System.out.println("h2");
        }
    }
    public static  class Parent {
        public void say() {
            System.out.println("부모");
        }
    }

    public static  class Child extends Parent {

        @Override
        public void say() {
            System.out.println("자식");
        }
    }
}
