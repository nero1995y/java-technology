package com.theory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {
    public void reflect() throws ClassNotFoundException {

        try {

            Class vectorClass = Class.forName("java.util.Vector");

            Method[] methods = vectorClass.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println(method.toString());
                System.out.println("===============");
            }

            Constructor constructors2[] = vectorClass.getConstructors();
            for (Constructor cons : constructors2) {
                System.out.println("Get public constructors in Child: " + cons);
            }
            // 클래스의 경로를 못찾을 경우 ! catch
        } catch (ClassNotFoundException e) {

        }

    }

}
