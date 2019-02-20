The code for this chapter is in the `ch08` directory of `ThinkJavaCode2`.
See page in section Using the code examples for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.

If you have not already read Appendix 0.7, now might be a good time.
It describes JUnit, a standard framework for writing test code.


**Exercise 9.1:**

The purpose of this exercise is to take a problem and break it into smaller problems, and to solve the smaller problems by writing simple methods.
Consider the first verse of the song “99 Bottles of Beer”:



> 99 bottles of beer on the wall,<br/>
> 99 bottles of beer,<br/>
> ya' take one down, ya' pass it around,<br/>
> 98 bottles of beer on the wall.


Subsequent verses are identical except that the number of bottles gets smaller by one in each verse, until the last verse:



> No bottles of beer on the wall,<br/>
> no bottles of beer,<br/>
> ya' can't take one down, ya' can't pass it around,<br/>
> 'cause there are no more bottles of beer on the wall!


And then the song (finally) ends.

Write a program that displays the entire lyrics of “99 Bottles of Beer”.
Your program should include a recursive method that does the hard part, but you might want to write additional methods to separate other parts of the program.
As you develop your code, test it with a small number of verses, like `3`.




**Exercise 9.2:**

Write a recursive method named `oddSum` that takes a positive odd integer `n` and returns the sum of odd integers from 1 to n.
Start with a base case, and use temporary variables to debug your solution.
You might find it helpful to print the value of `n` each time `oddSum` is invoked.




**Exercise 9.3:**

In this exercise, you will use a stack diagram to understand the execution of the following recursive method.

```code
public static void main(String[] args) {
    System.out.println(prod(1, 4));
}

public static int prod(int m, int n) {
    if (m == n) {
        return n;
    } else {
        int recurse = prod(m, n - 1);
        int result = n * recurse;
        return result;
    }
}
```



1.  Draw a stack diagram showing the state of the program just before the last invocation of `prod` completes.

1.  What is the output of this program?
(Try to answer this question on paper first, then run the code to check your answer.)

1.  Explain in a few words what `prod` does (without getting into the details of how it works).

1.  Rewrite `prod` without the temporary variables `recurse` and `result`.
*Hint:* You only need one line for the `else` branch.





**Exercise 9.4:**

The goal of this exercise is to translate a recursive definition into a Java method.
The Ackermann function is defined for non-negative integers as follows:
$$
A(m, n) = \begin{cases}
              n+1 & \mbox{if } m = 0 \\
        A(m-1, 1) & \mbox{if } m > 0 \mbox{ and } n = 0 \\
A(m-1, A(m, n-1)) & \mbox{if } m > 0 \mbox{ and } n > 0
\end{cases}
$$

Write a recursive method called `ack` that takes two `int`s as parameters and that computes and returns the value of the Ackermann function.

Test your implementation of Ackermann by invoking it from `main` and displaying the return value.
Note the return value gets very big very quickly.
You should try it only for small values of $m$ and $n$ (not bigger than 3).




**Exercise 9.5:**

Write a recursive method called `power` that takes a double `x` and an integer `n` and returns $x^n$.

*Hint:* A recursive definition of this operation is $x^n = x \cdot x^{n-1}$.
Also, remember that anything raised to the zeroth power is 1.

Optional challenge: you can make this method more efficient, when `n` is even, using $x^n = \left( x^{n/2} \right)^2$.




**Exercise 9.6:**

Many of the patterns we have seen for traversing arrays can also be written recursively.
It is not common, but it is a useful exercise.



1.  Write a method called `maxInRange` that takes an array of integers and two indexes, `lowIndex` and `highIndex`, and finds the maximum value in the array, but only considering the elements between `lowIndex` and `highIndex`, including both.

This method should be recursive.
If the length of the range is 1, that is, if `lowIndex == highIndex`, we know immediately that the sole element in the range must be the maximum.
So that's the base case.

If there is more than one element in the range, we can break the array into two pieces, find the maximum in each of the pieces, and then find the maximum of the maxima.

1.  Methods like `maxInRange` can be awkward to use.
To find the largest element in an array, we have to provide the range for the entire array.

```code
double max = maxInRange(a, 0, a.length - 1);
```

Write a method called `max` that takes an array and uses `maxInRange` to find and return the largest element.





**Exercise 9.7:**

Create a program called `Recurse.java` and type in the following methods:

```code
/**
 * Returns the first character of the given String.
 */
public static char first(String s) {
    return s.charAt(0);
}
```

```code
/**
 * Returns all but the first letter of the given String.
 */
public static String rest(String s) {
    return s.substring(1);
}
```

```code
/**
 * Returns all but the first and last letter of the String.
 */
public static String middle(String s) {
    return s.substring(1, s.length() - 1);
}
```

```code
/**
 * Returns the length of the given String.
 */
public static int length(String s) {
    return s.length();
}
```



1.  Write some code in `main` that tests each of these methods.
Make sure they work, and you understand what they do.

1.  Using these methods, and without using any other `String` methods, write a method called `printString` that takes a string as a parameter and that displays the letters of the string, one on each line.
It should be a void method.

1.  Again using only these methods, write a method called `printBackward` that does the same thing as `printString` but that displays the string backward (again, one character per line).

1.  Now write a method called `reverseString` that takes a string as a parameter and that returns a new string as a return value.
The new string should contain the same letters as the parameter, but in reverse order.

```code
String backwards = reverseString("coffee");
System.out.println(backwards);
```

The output of this example code should be:

```code
eeffoc
```


1.  A palindrome is a word that reads the same both forward and backward, like “otto” and “palindromeemordnilap”.
Here's one way to test whether a string is a palindrome:



> A single letter is a palindrome, a two-letter word is a palindrome if the letters are the same, and any other word is a palindrome if the first letter is the same as the last and the middle is a palindrome.


Write a recursive method named `isPalindrome` that takes a `String` and returns a `boolean` indicating whether the word is a palindrome.