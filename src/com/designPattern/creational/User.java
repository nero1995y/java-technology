package com.designPattern.creational;

public class User {

    private String name;
    private int age;
    private int height;
    private int iq;

    // 객체 생성
    public static UserBuilder builder(){
        return new UserBuilder();
    }

    static class UserBuilder {
        String name;
        int age;
        int height;
        int iq;

        UserBuilder name(String name){
            this.name = name;
            return this;
        }
        UserBuilder age(int age){
            this.age = age;
            return this;
        }
        UserBuilder height(int height){
            this.height = height;
            return this;
        }
        UserBuilder iq(int iq){
            this.iq = iq;
            return this;
        }
        User build(){
            User user = new User();
            user.name = this.name;
            user.age = this.age;
            user.height = this.height;

            return user;
        }


    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", iq=" + iq +
                '}';
    }
}
