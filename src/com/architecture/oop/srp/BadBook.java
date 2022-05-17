package com.architecture.oop.srp;

public class BadBook {
    // 도서관리, 책표현 메커니즘 actor가 2개가 된다
    public String geTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "Jon Doe";
    }

    public int turnPage() {
        // ..
        return  1;
    }
    //bad
    public String printCurrentPage() {
        return "current page content";
    }
}
