package com.theory.equals;

public class EqualsMain {
    public static void main(String [] args ){
        String s1 = new String("test");
        String s2 = new String("test");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s1));


        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(100);
        e2.setId(100);

        System.out.println(e1.equals(e2));

    }
}
