package com.designPattern.creational;

public class User {

    private String name;
    private int age;
    private int height;
    private int iq;

    // 객체 생성
    public static UserBulider bulider(){
        return new UserBulider();
    }

    static class UserBulider{
        String name;
        int age;
        int height;
        int iq;

        UserBulider name(String name){
            this.name = name;
            return this;
        }
        UserBulider age(int age){
            this.age = age;
            return this;
        }
        UserBulider height(int height){
            this.height = height;
            return this;
        }
        UserBulider iq(int iq){
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
