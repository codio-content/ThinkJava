The following loop iterates the characters in `fruit` and displays them, one on each line:

```code
for (int i = 0; i < fruit.length(); i++) {
    char letter = fruit.charAt(i);
    System.out.println(letter);
}
```


Strings provide a method called `length` that returns the number of characters in the string. Because it is a method, you have to invoke it with the empty argument list, `()`. When `i` is equal to the length of the string, the condition becomes `false` and the loop terminates.

To find the last letter of a string, you might be tempted to do something like:

```code
int length = fruit.length();
char last = fruit.charAt(length);      // wrong!
```


This code compiles and runs, but invoking the `charAt` method throws a `StringIndexOutOfBoundsException`. The problem is that there is no sixth letter in `"banana"`. Since we started counting at 0, the 6 letters are indexed from 0 to 5. To get the last character, you have to subtract 1 from `length`.

```code
int length = fruit.length();
char last = fruit.charAt(length - 1);  // correct
```
Try it out in the left pane. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/StringIteration.java java -cp code/ StringIteration )


Many string algorithms involve reading one string and building another. For example, to reverse a string, we can add one character at a time:

```code
public static String reverse(String s) {
    String r = "";
    for (int i = s.length() - 1; i >= 0; i--) {
        r += s.charAt(i);
    }
    return r;
}
```


The initial value of `r` is `""`, which is the **empty string**. The loop iterates the letters of `s` in reverse order. Each time through the loop, it creates a new string and assigns it to `r`. When the loop exits, `r` contains the letters from `s` in reverse order. So the result of `reverse("banana")` is `"ananab"`.