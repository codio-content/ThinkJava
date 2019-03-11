Up to this point, the only variables we have used were for individual values such as numbers or strings.
In this chapter, we'll learn how to store multiple values of the same type using a single variable.
This language feature will enable you to write programs that manipulate larger amounts of data.

For example, Exercise 6.5 asked you to check whether every letter in a string appears exactly twice.
One algorithm (which hopefully you already discovered) is to loop through the string 26 times, once for each lowercase letter:

```code
for (char c = 'a'; c <= 'z'; c++) {
    // count how many times the letter appears
    // if the count is not 0 or 2, return false
}
```

This “nested loops” approach is inefficient, especially when the string is long (e.g., one billion characters).
Another algorithm would initialize 26 variables to zero, loop through the string once, and use a giant `if` statement update the variable for each letter.
But who wants to declare 26 variables?

That's where arrays come in.
We can declare a single variable that stores 26 integers.
Rather than use an `if` statement to update each value, we can use arithmetic to update the $n$th value directly.
We will present this algorithm at the end of the chapter.