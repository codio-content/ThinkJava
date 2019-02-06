###  Exercises


The code for this chapter is in the `ch07` directory of `ThinkJavaCode2`.
See page in section **Using the code examples** for instructions on how to download the repository.
Before you start the exercises, we recommend that you compile and run the examples.

If you haven't already, take a look at Appendix **19** where we've collected some of our favorite debugging advice.
It refers to language features we haven't yet covered, but it's good for you to know what's available when you need it.


**Exercise 8.1:**

The purpose of this exercise is to practice reading code and recognizing the traversal patterns in this chapter.
The following methods are hard to read, because instead of using meaningful names for the variables and methods, they use names of fruit.

For each method, write one sentence that describes what the method does, without getting into the details of how it works.
And for each variable, identify the role it plays.

```code
public static int banana(int[] a) {
    int kiwi = 1;
    int i = 0;
    while (i < a.length) {
        kiwi = kiwi * a[i];
        i++;
    }
    return kiwi;
}
```

```code
public static int grapefruit(int[] a, int grape) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] == grape) {
            return i;
        }
    }
    return -1;
}
```

```code
public static int pineapple(int[] a, int apple) {
    int pear = 0;
    for (int pine: a) {
        if (pine == apple) {
            pear++;
        }
    }
    return pear;
}
```




**Exercise 8.2:**

What is the output of the following program?
Describe in a few words what `mus` does.
Draw a stack diagram just before `mus` returns.

```code
public static int[] make(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = i + 1;
    }
    return a;
}
```

```code
public static void dub(int[] jub) {
    for (int i = 0; i < jub.length; i++) {
        jub[i] *= 2;
    }
}
```

```code
public static int mus(int[] zoo) {
    int fus = 0;
    for (int i = 0; i < zoo.length; i++) {
        fus += zoo[i];
    }
    return fus;
}
```

```code
public static void main(String[] args) {
    int[] bob = make(5);
    dub(bob);
    System.out.println(mus(bob));
}
```




**Exercise 8.3:**

Write a method called `indexOfMax` that takes an array of integers and returns the index of the largest element.
Can you write this method using an enhanced `for` loop?
Why or why not?




**Exercise 8.4:**

The Sieve of Eratosthenes is “a simple, ancient algorithm for finding all prime numbers up to any given limit,” which you can read about at [https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes).

Write a method called `sieve` that takes an integer parameter, `n`, and returns a `boolean` array that indicates, for each number from `0` to `n - 1`, whether the number is prime.




**Exercise 8.5:**

Write a method named `areFactors` that takes an integer `n` and an array of integers, and that returns `true` if the numbers in the array are all factors of `n` (which is to say that `n` is divisible by all of them).




**Exercise 8.6:**

Write a method named `arePrimeFactors` that takes an integer `n` and an array of integers, and that returns `true` if the numbers in the array are all prime *and* their product is `n`.




**Exercise 8.7:**

Write a method called `letterHist` that takes a string as a parameter and returns a histogram of the letters in the string.
The zeroth element of the histogram should contain the number of a's in the string (upper- and lowercase); the 25th element should contain the number of z's.
Your solution should only traverse the string once.




**Exercise 8.8:**


Two words are anagrams if they contain the same letters and the same number of each letter.
For example, “stop” is an anagram of “pots” and “allen downey” is an anagram of “well annoyed”.
Write a method that takes two strings and checks whether they are anagrams of each other.