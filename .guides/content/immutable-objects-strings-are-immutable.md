If the Java library didn't have a `String` class, we would have to use character arrays to store and manipulate text. Operations like concatenation (`+`), `indexOf`, and `substring` would be difficult and inconvenient. Fortunately, Java does have a `String` class that provides these and other methods.


For example, the methods `toLowerCase` and `toUpperCase` convert uppercase letters to lowercase, and vice versa. These methods are often a source of confusion, because it sounds like they modify strings. But neither these methods nor any others can change a string, because strings are **immutable**.

When you invoke `toUpperCase` on a string, you get another `String` object as a result. For example:

```code
String name = "Alan Turing";
String upperName = name.toUpperCase();
```

Try it out in the panel to the left. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/ImmutableStrings.java java -cp code/ ImmutableStrings )


After these statements run, `upperName` refers to the string `"ALAN TURING"`. But `name` still refers to `"Alan Turing"`. A common mistake is to assume that `toUpperCase` somehow affects the original string:

```code
String name = "Alan Turing";
name.toUpperCase();           // ignores the return value
System.out.println(name);
```

The previous code displays `"Alan Turing"`, because the value of `name` (i.e., the reference to the original `String` object) never changes. If you want to change `name` to be uppercase, then you need to assign the return value to it:

```code
String name = "Alan Turing";
name = name.toUpperCase();    // references the new string
System.out.println(name);
```

{Run!}(sh .guides/bg.sh javac code/Remainder.java java -cp code/ Remainder 2 )


A similar method is `replace`, which finds and replaces instances of one string within another. This example replaces `"Computer Science"` with `"CS"`:

```code
String text = "Computer Science is fun!";
text = text.replace("Computer Science", "CS");
```


As with `toUpperCase`, assigning the return value (to `text`) is important. If you don't assign the return value, invoking `text.replace` has no effect.


Strings are immutable by design, because it simplifies passing them between methods as parameters and return values. And since the contents of a string can never change, two variables can reference the same string without one accidentally corrupting the other.