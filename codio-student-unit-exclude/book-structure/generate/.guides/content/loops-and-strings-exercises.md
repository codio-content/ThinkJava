###  Exercises


The code for this chapter is in the `ch06` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.

If you have not already read Appendix 16.6, now might be a good time.
It describes the DrJava debugger, which is a useful tool for visualizing the flow of execution through loops.


**Exercise 7.1:**

Consider the following methods:

```code
public static void main(String[] args) {
    loop(10);
}

public static void loop(int n) {
    int i = n;
    while (i > 1) {
        System.out.println(i);
        if (i % 2 == 0) {
            i = i / 2;
        } else {
            i = i + 1;
        }
    }
}
```



1.  Draw a table that shows the value of the variables `i` and `n` during the execution of `loop`.
The table should contain one column for each variable and one line for each iteration.

1.  What is the output of this program?

1.  Can you prove that this loop terminates for any positive value of `n`?





**Exercise 7.2:**

Let's say you are given a number, $a$, and you want to find its square root.
One way to do that is to start with a rough guess about the answer, $x_0$, and then improve the guess using this formula:
$ x_1 =(x_0 + a/x_0) / 2 $
For example, if we want to find the square root of 9, and we start with $x_0 = 6$, then $x_1 = (6 + 9/6) / 2 = 3.75$, which is closer.
We can repeat the procedure, using $x_1$ to calculate $x_2$, and so on.
In this case, $x_2 = 3.075$ and $x_3 = 3.00091$.
So it converges quickly on the correct answer.

Write a method called `squareRoot` that takes a `double` and returns an approximation of the square root of the parameter, using this technique.
You should not use `Math.sqrt`.

As your initial guess, you should use $a/2$.
Your method should iterate until it gets two consecutive estimates that differ by less than 0.0001.
You can use `Math.abs` to calculate the absolute value of the difference.




**Exercise 7.3:**

One way to evaluate $\exp(-x^2)$ is to use the infinite series expansion:
$ \exp(-x^2) = 1 - x^2 + x^4/2 - x^6/6 + \ldots $
The $i$th term in this series is $(-1)^i x^{2i} / i!$.
Write a method named `gauss` that takes `x` and `n` as arguments and returns the sum of the first `n` terms of the series.
You should not use `factorial` or `pow`.




**Exercise 7.4:**


A word is said to be “abecedarian” if the letters in the word appear in alphabetical order.
For example, the following are all six-letter English abecedarian words:



> abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, 
> beknow, bijoux, biopsy, cestuy, chintz, deflux, dehors, dehort, 
> deinos, diluvy, dimpsy 


Write a method called `isAbecedarian` that takes a `String` and returns a `boolean` indicating whether the word is abecedarian.




**Exercise 7.5:**


A word is said to be a “doubloon” if every letter that appears in the word appears exactly twice.
Here are some example doubloons found in the dictionary:



> Abba, Anna, appall, appearer, appeases, arraigning, beriberi, bilabial, boob, Caucasus, coco, Dada, deed, Emmett, Hannah, horseshoer, intestines, Isis, mama, Mimi, murmur, noon, Otto, papa, peep, reappear, redder, sees, Shanghaiings, Toto


Write a method called `isDoubloon` that takes a string and checks whether it is a doubloon.
To ignore case, invoke the `toLowerCase` method before checking.



**Exercise 7.6:**


In Scrabble\footnote{Scrabble is a registered trademark owned in the USA and Canada by Hasbro Inc., and in the rest of the world by J.\ W.\ Spear \& Sons Limited of Maidenhead, Berkshire, England, a subsidiary of Mattel Inc.} each player has a set of tiles with letters on them.
The object of the game is to use those letters to spell words.
The scoring system is complex, but longer words are usually worth more than shorter words.

Imagine you are given your set of tiles as a string, like `"quijibo"`, and you are given another string to test, like `"jib"`.

Write a method called `canSpell` that takes two strings and checks whether the set of tiles can spell the word.
You might have more than one tile with the same letter, but you can only use each tile once.