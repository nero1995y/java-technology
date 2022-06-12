package com.architecture.oop.lsp.violation;

public class LspMain {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(3);
        rectangle.setHeight(2);

        if (rectangle.getHeight() <= rectangle.getWidth()) {
            rectangle.setHeight(rectangle.getWidth() + 1);

        }
        
    }
}