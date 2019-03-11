As explained in Section 7.2, array variables contain *references* to arrays.
When you make an assignment to an array variable, it simply copies the reference.
But it doesn't copy the array itself.
For example:

```code
double[] a = new double[3];
double[] b = a;
```

These statements create an array of three `double`s and make two different variables refer to it, as shown in Figure 7.3.


![Figure 8.3 Memory diagram of two variables referring to the same array.](figs/array3.jpg)

**Figure 8.3 Memory diagram of two variables referring to the same array.**


Any changes made through either variable will be seen by the other.
For example, if we set `a[0] = 17.0`, and then display `b[0]`, the result is `17.0`.
Because `a` and `b` are different names for the same thing, they are sometimes called **aliases**.

If you actually want to copy the array, not just the reference, you have to create a new array and copy the elements from one to the other, like this:

```code
double[] b = new double[3];
for (int i = 0; i < 3; i++) {
    b[i] = a[i];
}
```


`java.util.Arrays` provides a method named `copyOf` that performs this task for you.
So you can replace the previous code with one line:

```code
double[] b = Arrays.copyOf(a, 3);
```

The second parameter is the number of elements you want to copy, so `copyOf` can also be used to copy part of an array.
Figure 7.4 shows the state of the array variables after invoking `Arrays.copyOf`.

![Figure 8.4 Memory diagram of two variables referring to different arrays.](figs/array4.jpg)

**Figure 8.4 Memory diagram of two variables referring to different arrays.**




The examples so far only work if the array has three elements.
It is better to generalize the code to work with arrays of any size.
We can do that by replacing the magic number, `3`, with `a.length`:

```code
double[] b = new double[a.length];
for (int i = 0; i < a.length; i++) {
    b[i] = a[i];
}
```

All arrays have a built-in constant, `length`, that stores the number of elements.
In contrast to `String.length()`, which is a method, `a.length` is a constant.
The expression `a.length` may look like a method invocation, but there are no parentheses and no arguments.

The last time the loop gets executed, `i` is `a.length - 1`, which is the index of the last element.
When `i` is equal to `a.length`, the condition fails and the body is not executed -- which is a good thing, because trying to access `a[a.length]` would throw an exception.

Of course we can replace the loop altogether by using `Arrays.copyOf` and `a.length` for the second argument.
The following line produces the same result shown in Figure 7.4.

```code
double[] b = Arrays.copyOf(a, a.length);
```