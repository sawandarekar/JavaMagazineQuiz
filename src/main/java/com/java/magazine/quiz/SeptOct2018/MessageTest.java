package com.java.magazine.quiz.SeptOct2018;


public class MessageTest {

    public static void main(String[] args) {
        Message m = new Message("Critical message", 255);
        boolean handled = false;
        Logger.log(m, handled);
        System.out.printf("Error code: %d, was handled: %b\n", m.code, handled);
    }

}
