package com.exception;

import java.io.IOException;

public class ExceptionMain {
    public static void main(String[] arg) throws FoolException {
        try {
            sayNick("fool");
        }catch (FoolException e){
            e.printStackTrace();
        }
    }

    public static void  sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        String str = "당신의 별명은 " + nick + "입니다";

        System.out.println(str);
    }
}
