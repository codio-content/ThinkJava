**Exercise 9.6:**


The following code fragment traverses a string and checks whether it has the same number of open and close parentheses:

```code
String s = "((3 + 7) * 2)";
int count = 0;

for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    if (c == '(') {
        count++;
    } else if (c == ')') {
        count--;
    }
}

System.out.println(count);
```



1.  Encapsulate this fragment in a method that takes a string argument and returns the final value of `count`.

1.  Test your method with multiple strings, including some that are balanced and some that are not.

1.  Generalize the code so that it works on any string. What could you do to generalize it more?