We now return to the example from the beginning of the chapter and present a solution to Exercise 6.5 using arrays. Here is the problem again:



> A word is said to be a “doubloon” if every letter that appears in the word appears exactly twice.
> Write a method called `isDoubloon` that takes a string and checks whether it is a doubloon.
> To ignore case, invoke the `toLowerCase` method before checking.


Based on the approach from Section 7.7, we will create an array of 26 integers to count how many times each letter appears. We convert the string to lowercase, so that we can treat `'A'` and `'a'` (for example) as the same latter.

```code
int[] counts = new int[26];
String lower = s.toLowerCase();
```

We can use a `for` loop to iterate each character in the string. To update the `counts` array, we need to compute the index that corresponds to each character. Fortunately, Java allows you to perform arithmetic on characters.

```code
for (int i = 0; i < lower.length(); i++) {
    char letter = lower.charAt(i);
    int index = letter - 'a';
    counts[index]++;
}
```


To simplify the code, it would be nice to use an enhanced `for` loop. The enhanced `for` loop does not work with strings directly, but you can convert any string to a character array and iterate that instead:

```code
for (char letter : lower.toCharArray()) {
    int index = letter - 'a';
    counts[index]++;
}
```

After counting all the characters in the `lower` string, we need one last `for` loop to determine whether each letter appears 0 or 2 times.

```code
for (int count : counts) {
    if (count != 0 && count != 2) {
        return false;  // not a doubloon
    }
}
return true;  // is a doubloon
```

Like in Section 7.5, we can return immediately if the inner condition is true (which, in this example, means that the word is not a doubloon). If we make it all the way through the `for` loop, we know that all counts are 0 or 2.

Pulling together the code fragments, and adding some comments and test cases, here is an entire program. It's amazing to think about how much you've learned in just seven chapters!