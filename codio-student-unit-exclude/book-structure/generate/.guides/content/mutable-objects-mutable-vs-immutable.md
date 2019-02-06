###  Mutable vs immutable



`Point`s and `Rectangle`s are **mutable** objects, because their attributes can be modified.
You can modify their attributes directly, like `box.x = 15`, or you can invoke methods that modify their attributes, like `box.translate(15, 0)`.

In contrast, immutable objects like `String`s and `Integer`s cannot be modified.
They do not give `public` access to their attributes, and they do not provide methods that change their attributes.

Immutable objects have a number of advantages that help improve the performance and reliability of programs.
For example, two strings that contain the same contents can be stored in memory only once.
The Java compiler automatically detects this situation:


```code
public class Surprise {
    public static void main(String[] args) {
        String s1 = "Hi, Mom!";
        String s2 = "Hi, " + "Mom!";
        if (s1 == s2) {  // true!
            System.out.println("s1 and s2 are the same");
        }
    }
}
```

In this example, `s1` and `s2` represent the *same* string, even though they are created differently.
Because strings are immutable, the compiler decides to reuse a single object for both `s1` and `s2`.
As a result, `s1 == s2`, even though it appears they should be different objects.

Since neither variable can change the string itself, both `s1` and `s2` will be `"Hi, Mom!"` until they are reassigned.
You can pass strings (and other immutable objects) to methods without worrying about their contents changing as a “side-effect” of the method.


On the other hand, mutable objects have their own advantages.
It's more efficient to move a rectangle by simply changing its coordinates than to create a brand new `Rectangle` each time.
And as we'll see later on, it's easier to implement objects that allow their attributes to be changed.

Strings are particularly inefficient when you need to concatenate them multiple times.
Consider the following program that inputs ten lines from `System.in` and concatenates them into a single `String`.


```code
import java.util.Scanner;
public class Append {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 lines:");
        String text = "";
        for (int i = 0; i < 10; i++) {
            String line = in.nextLine();        // new string
            text = text + line + '\n';    // two more strings
        }
        System.out.print("You entered:\n" + text);
    }
}
```

Each time that `in.nextLine()` is invoked, it returns a new string.
The next line of code performs `text + line`, which creates another string, and then appends the newline character, which creates yet another string.

As a result, the `for` loop creates 30 `String` objects!
The variable `text` references only the most recent `String` object.
Garbage collection will delete the other strings, but that's a lot of garbage for a seemly simple program.

The Java library provides the class `StringBuilder` for this situation.
It's part of the `java.lang` package, so you don't need to import it.
Because `StringBuilder` objects are mutable, they can implement concatenation much more efficiently.

All we need to change is the `text` variable and the body of the `for` loop:

```code
StringBuilder text = new StringBuilder();
for (int i = 0; i < 10; i++) {
    String line = in.nextLine();
    text.append(line);
    text.append('\n');
}
```

`StringBuilder` provides a number of `append` and `insert` methods that work with strings efficiently.
It also allows you to `delete` portions of a string.