An **array** is a sequence of values; the values in the array are called **elements**. You can make an array of `int`s, `double`s, `String`s, or any other type, but all the values in an array must have the same type.


To create an array, you have to declare a variable with an *array type* and then create the array itself. Array types look like other Java types, except they are followed by square brackets (`[]`). For example, the following lines declare that `counts` is an “integer array” and `values` is a “double array”:

```code
int[] counts;
double[] values;
```


To create the array itself, you have to use the `new` operator, which we first saw in Section 3.2. The `new` operator **allocates** memory for the array and automatically initializes all of its elements to zero.

```code
counts = new int[4];
values = new double[size];
```

The first assignment makes `counts` refer to an array of four integers. The second makes `values` refer to an array of `double`s, but the number of elements depends on the value of `size` (at the time the array is created).

Of course, you can also declare the variable and create the array with a single line of code:

```code
int[] counts = new int[4];
double[] values = new double[size];
```


You can use any integer expression for the size of an array, as long as the value is nonnegative. If you try to create an array with `-4` elements, for example, you will get a `NegativeArraySizeException`. An array with zero elements is allowed, and there are special uses for such arrays that we'll see later on.