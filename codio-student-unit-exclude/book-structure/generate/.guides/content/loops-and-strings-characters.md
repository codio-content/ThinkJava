Some of the most interesting problems in computer science involve searching and manipulating text. In the next few sections, we'll discuss how to apply loops to strings. Although the examples are short, the techniques work the same whether you have one word or one million words.


Strings provide a method named `charAt`. It returns a `char`, a data type that stores an individual character (as opposed to strings of them).

```code
String fruit = "banana";
char letter = fruit.charAt(0);
```

Try it out in the left pane. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/Characters.java java -cp code/ Characters )


The argument `0` means that we want the character at **index** 0. String indexes range from 0 to $n-1$, where $n$ is the length of the string. So the character assigned to `letter` is `b`.

|\multicolumn{1}{&#124;l&#124;}{b}|\multicolumn{1}{l&#124;}{a}|\multicolumn{1}{l&#124;}{n}|\multicolumn{1}{l&#124;}{a}|\multicolumn{1}{l&#124;}{n}|\multicolumn{1}{l&#124;}{a} \\ \hline|
|-|-|-|-|-|-|
|0                      |1                     |2                     |3                     |4                     |5|



Characters work like the other data types we have seen. You can compare them using relational operators:

```code
if (letter == 'a') {
    System.out.println('?');
}
```

{Run!}(sh .guides/bg.sh javac code/Characters.java java -cp code/ Characters 2 )


Character literals, like `'a'`, appear in single quotes. Unlike string literals, which appear in double quotes, character literals can only contain a single character. Escape sequences, like `'\t'`, are legal because they represent a single character.

The increment and decrement operators also work with characters. So this loop displays the letters of the alphabet:

```code
System.out.print("Roman alphabet: ");
for (char c = 'A'; c <= 'Z'; c++) {
    System.out.print(c);
}
System.out.println();
```


Java uses **Unicode** to represent characters, so strings can store text in other alphabets like Cyrillic and Greek, and non-alphabetic languages like Chinese. You can read more about it at [http://unicode.org/](http://unicode.org/).

In Unicode, each character is represented by a “code point”, which you can think of as an integer. The code points for uppercase Greek letters run from 913 to 937, so we can display the Greek alphabet like this:

```code
System.out.print("Greek alphabet: ");
for (int i = 913; i <= 937; i++) {
    System.out.print((char) i);
}
System.out.println();
```

{Run!}(sh .guides/bg.sh javac code/Characters.java java -cp code/ Characters 3 )


This example uses a type cast to convert each integer (in the range) to the corresponding character. Try running the code and see what happens.