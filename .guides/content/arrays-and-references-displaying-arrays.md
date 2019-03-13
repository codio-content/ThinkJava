You can use `println` to display an array, but it probably doesn't do what you would like. For example, the following fragment (1) declares an array variable, (2) makes it refer to an array of four elements, and (3) attempts to display the contents of the array using `println`:

```code
int[] a = {1, 2, 3, 4};
System.out.println(a);
```

Unfortunately, the output is something like:

```code
[I@bf3f7e0
```

The bracket indicates that the value is an array, `I` stands for “integer”, and the rest represents the address of the array in memory. If we want to display the elements of the array, we could do it ourselves:

```code
public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}
```

Given the previous array, the output of `printArray` is:

```code
{1, 2, 3, 4}
```


The Java library provides a utility class `java.util.Arrays` that has methods for working with arrays. One of them, `toString`, returns a string representation of an array. We can invoke it like this:

```code
System.out.println(Arrays.toString(a));
```

And the output is:

```code
[1, 2, 3, 4]
```

As usual, we have to `import java.util.Arrays` before we can use it. Notice that the string format is slightly different: it uses square brackets instead of curly braces. But it beats having to write your own `printArray` method.