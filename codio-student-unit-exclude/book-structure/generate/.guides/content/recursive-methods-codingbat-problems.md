In the past several chapters of this book, you've seen conditions, methods, loops, strings, arrays, and recursion.
A great resource for practicing all of these concepts is [http://codingbat.com/java](CodingBat.com).


CodingBat is a free website of live programming problems developed by Nick Parlante, a Computer Science lecturer at Stanford.
As you work on these problems, CodingBat will save your progress (if you create an account).

To conclude this chapter, we will look at two problems in the **Recursion-1** section of CodingBat.
One of them deals with strings, and the other deals with arrays.
Both of them have the same recursive idea: check the base case, look at the current index, and recursively handle the rest.

The first problem is available at [http://codingbat.com/prob/p118230](http://codingbat.com/prob/p118230):



> **Recursion-1  noX**
> 
> Given a string, compute recursively a new string where all the 'x' chars have been removed.
> 
> noX("xaxb") $\rightarrow$ "ab" <br/>
> noX("abc") $\rightarrow$ "abc" <br/>
> noX("xx") $\rightarrow$ ""


When solving recursive problems, it helps to think about the base case first.
The base case is the easiest version of the problem; for noX, it's when you're given the empty string.
If the string is empty, there are no x's to be removed.

```code
if (str.length() == 0) {
    return "";
}
```

Next comes the more difficult part.
To solve a problem recursively, you need to think of a simper instance of the same problem.
For noX, it's removing all the x's from a shorter string.

To find an x, we only need to look at one character.
So we can recursively call noX on the rest of the string (the substring at index 1).
Here is the solution:

```code
char c = str.charAt(0);
if (c == 'x') {
    return noX(str.substring(1));
} else {
    return c + noX(str.substring(1));
}
```

The `else` block “saves” the character if it's not an x.
Otherwise, the x is “removed” by the first `return` statement.

The second problem is available at [http://codingbat.com/prob/p135988](http://codingbat.com/prob/p135988):



> **Recursion-1  array11**
> 
> Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
> 
> array11([1, 2, 11], 0) $\rightarrow$ 1 <br/>
> array11([11, 11], 0) $\rightarrow$ 2 <br/>
> array11([1, 2, 3, 4], 0) $\rightarrow$ 0


This problem uses the convention of passing the index as an argument.
So the base case is when we've reached the end of the array.
At that point, we know there are no more 11's.

```code
if (index >= nums.length) {
    return 0;
}
```

Next we look at the current number (based on the given index), and check if it's an 11.
After that, we can recursively check the rest of the array.
Similar to the noX problem, we only look at one integer per method call.

```code
if (nums[index] == 11) {
    return 1 + array11(nums, index + 1);
} else {
    return array11(nums, index + 1);
}
```

You can run these solutions on CodingBat by pasting them into the provided method definition.
But don't forget to paste both parts: the base case, and the recursive step.


To see how these solutions actually work, you might need to step through them with a debugger (see Appendix 15.6) or Java Tutor ([http://pythontutor.com/java.html](http://pythontutor.com/java.html)).
Then try to solve several CodingBat problems of your own.

Learning to think recursively is an important aspect of learning to think like a computer scientist.
Many algorithms can be written concisely with recursive methods that perform computations on the way down, on the way up, or both.