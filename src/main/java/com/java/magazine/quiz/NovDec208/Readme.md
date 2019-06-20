####Question 1 (intermediate). 
What is true about the enhanced for statement? Choose one.
1. A. The loop cannot iterate directly over java.util.HashSet.
2. B. The loop can iterate directly over java.util.Map.
3. C. The loop does not provide access to the index of the current element.
4. D. The loop supports deletion of the current element during execution of the loop.
5. E. Early termination of the loop via a break statement is prohibited.

----
####Question 2 (advanced). 
Given the following code and assuming the numbers at the left are line numbers, not part of the source file:

```
11: public class Ex2<T extends Runnable, String> {
12: 	String s = "Hello";
13: 	public void test(T t) {
14: 		t.run();
15: 	}
16: }
```
Which one of the following is true?
* A. Line 11 fails to compile.
* B. Line 12 fails to compile.
* C. Line 13 fails to compile.
* D. Line 14 fails to compile.
* E. Compilation succeeds.

----
####Question 3 (advanced). 
Given the following:

```
List<String> wordList = Arrays.asList("how", "this", "may", "be", "correct");
Set<String> words1 = new HashSet<>(wordList);
Set<String> words2 = new TreeSet<>(wordList);

//CODE OMITTED HERE

System.out.print(words1.stream().findFirst().get());
System.out.println(words2.stream().findFirst().get());
```
Assume that the behavior of the code not shown at the ``//CODE OMITTED HERE`` line is to add more
elements to both sets and then delete all the newly added elements. As a result, the number
and values of the data items in the sets after this comment are identical to the contents before
this line.

Which best describes the possible output?
* A. bebe
* B. be<any value from list>
* C. <any value from list>be
* D. <any value from list><any value from list>

---
