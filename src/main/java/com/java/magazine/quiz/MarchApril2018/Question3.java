package com.java.magazine.quiz.MarchApril2018;

// Which is true?
// A. The output is Hello!
// B. The output is Bonjour!
// C. Compilation fails, but if line n1 is altered to @FunctionalInterface then the output is Hello!
// D. Compilation fails, but if line n2 is altered to Something s = () -> Something.super.speak();
// then the output is Hello!
// E. Compilation fails, but if line n2 is altered to Something s = () -> TryThis.this.speak();
// then the output is Bonjour!

interface Something {

    void execute();

    default void speak() {
        System.out.println("Hello!");
    }
}

public class Question3 {

    public void speak() {
        System.out.println("Bonjour!");
    }

    public void go() {
        Something s = () -> this.speak(); // line n2
        s.execute();
    }

    public static void main(String[] args) {
        new Question3().go();
    }
}
