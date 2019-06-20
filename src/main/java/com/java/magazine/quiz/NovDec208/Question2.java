package com.java.magazine.quiz.NovDec208;

public class Question2<T extends Runnable, String> {

    String s = "Hello";

    public void test(T t) {
        t.run();
    }
}