package com.base.generic;

public class Util {
    public static <T> Box<T> boxting(T t){

        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }
}
