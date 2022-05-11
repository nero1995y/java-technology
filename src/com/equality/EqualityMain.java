package com.equality;

public class EqualityMain {
    public static void main(String[] arg) {
        int a = 1;
        int b = 1;
        int c = 3;
        int d = 4;
        System.out.println(a == b);
        System.out.println(c == d);

        String str1 = new String("hi");
        String str2 = new String("hi");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }


}
