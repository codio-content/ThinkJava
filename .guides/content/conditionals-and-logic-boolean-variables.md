To store a `true` or `false` value, you need a `boolean` variable.
You can declare and assign them like other variables.
In this example, the first line is a variable declaration, the second is an assignment, and the third is both:

```code
boolean flag;
flag = true;
boolean testResult = false;
```


Since relational and logical operators evaluate to a `boolean` value, you can store the result of a comparison in a variable:

```code
boolean evenFlag = (n % 2 == 0);    // true if n is even
boolean positiveFlag = (x > 0);     // true if x is positive
```

Try it out in the left pane. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/BooleanVars.java java -cp code/ BooleanVars )


The parentheses are unnecessary, but they make the code easier to understand.
A variable defined in this way is called a **flag**, because it signals or “flags” the presence or absence of a condition.

You can use flag variables as part of a conditional statement:

```code
if (evenFlag) {
    System.out.println("n was even when I checked it");
}
```

Flags may not seem that useful at this point, but they will help simplify complex conditions later on.
Each part of a condition can be stored in a separate flag, and these flags can be combined with logical operators.

Notice that you don't have to write  `if (evenFlag == true)`.
Since `evenFlag` is a `boolean`, it's already a condition.
Furthermore, to check if a flag is `false`:

```code
if (!evenFlag) {
    System.out.println("n was odd when I checked it");
}
```
{Run!}(sh .guides/bg.sh javac code/BooleanVars.java java -cp code/ BooleanVars 2 )
