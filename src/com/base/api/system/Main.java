package com.base.api.system;

public class Main {
    public static void main(String[] args) {

        String version = System.getProperty("java.version");
        String home = System.getProperty("java.home");
        System.out.println(version);
        System.out.println(home);
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getenv("JAVA_HOME"));
    }
}
