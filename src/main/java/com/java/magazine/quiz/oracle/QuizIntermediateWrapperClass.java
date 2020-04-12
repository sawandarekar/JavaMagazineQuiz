package com.java.magazine.quiz.oracle;

public class QuizIntermediateWrapperClass {

    public static void main(String[] args) {
        String one = "1";
        Boolean b1 = Boolean.valueOf(one);  // line n1
        Integer i1 = new Integer(one);
        Integer i2 = 1;
        if (b1) {
            System.out.print(i1 == i2);
        }
    }
}
