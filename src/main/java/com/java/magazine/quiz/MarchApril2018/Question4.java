package com.java.magazine.quiz.MarchApril2018;

import java.util.stream.IntStream;

//What is the result?
//A. Compilation fails because of an error at line n1.
//B. The code throws a runtime exception because of the position of line n1.
//C. The code prints out one line containing the sequence of capital letters A through Z
//repeated twice.
//D. The code prints out one line containing the capital letters A through Z with two of each
//letter, but they are not necessarily in order.
//E. The code prints only a single, empty line and then exits.

public class Question4 {
    public static void main(String[] args) {
	StringBuilder sb = IntStream.iterate(0, x -> (x + 1) % 26)
		.mapToObj(x -> new StringBuilder("" + (char) (x + 'A'))).parallel() // line n1
		.limit(52).collect(() -> new StringBuilder(), (x, y) -> y.append(x), (x, y) -> y.append(x));
	System.out.println(sb);
    }
}
