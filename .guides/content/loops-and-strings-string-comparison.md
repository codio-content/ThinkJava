###  String comparison



To compare two strings, it may be tempting to use the `==` and `!=` operators.

```code
String name1 = "Alan Turing";
String name2 = "Ada Lovelace";
if (name1 == name2) {                 // wrong!
    System.out.println("The names are the same.");
}
```

This code compiles and runs, and sometimes it gets the answer right.
But sometimes it gets the answer wrong.
If you give it two different strings that contain the same letters, the condition will be `false`.

The problem is that the `==` operator checks whether the two variables refer to the *same object* by comparing the references.
We'll learn more about references in the next chapter.
The correct way to compare strings is with the `equals` method, like this:

```code
if (name1.equals(name2)) {
    System.out.println("The names are the same.");
}
```

This example invokes `equals` on `name1` and passes `name2` as an argument.
The `equals` method returns `true` if the strings contain the same characters; otherwise it returns `false`.


If the strings differ, we can use `compareTo` to see which comes first in alphabetical order:

```code
int diff = name1.compareTo(name2);
if (diff == 0) {
    System.out.println("The names are the same.");
} else if (diff < 0) {
    System.out.println("name1 comes before name2.");
} else if (diff > 0) {
    System.out.println("name2 comes before name1.");
}
```

The return value from `compareTo` is the difference between the first characters in the strings that are not the same.
In the preceding code, `compareTo` returns positive 8, because the second letter of `"Ada"` comes before the second letter of `"Alan"` by 8 letters.

If the strings are equal, their difference is zero.
If the first string (the one on which the method is invoked) comes first in the alphabet, the difference is negative.
Otherwise, the difference is positive.


Both `equals` and `compareTo` are case-sensitive.
In Unicode, uppercase letters come before lowercase letters.
So `"Ada"` comes before `"ada"`.