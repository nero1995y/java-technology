package com.base.api.objects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        long time = System.nanoTime();
        long time3 = System.currentTimeMillis();

        Student s1 = new Student(1);
        Student s2 = new Student(1);
        Student s3 = new Student(2);

        int result = Objects.compare(s1, s2, new StudentComparator());
        System.out.println(result);

        result = Objects.compare(s1, s3, new StudentComparator());
        System.out.println(result);

        // 동등 비교
        Integer i1 = 1000;
        Integer i2 = 1000;

        System.out.println(i1.equals(i2) == Objects.equals(i1, i2));

        // 배열 동등 비교
        Integer[] arr1 = {1, 2};
        Integer[] arr2 = {2, 1};

        // 순서 틀리면 false
        System.out.println(Objects.deepEquals(arr1, arr2));

        boolean b = Arrays.deepEquals(arr1, arr2);

        System.out.println(Objects.deepEquals(arr1, arr2) ==  b);

        // 해쉬코드
        System.out.println(s1.hashCode());
        System.out.println(Objects.hashCode(s1));

        long time2 = System.nanoTime();
        System.out.println(time2- time);

    }
}