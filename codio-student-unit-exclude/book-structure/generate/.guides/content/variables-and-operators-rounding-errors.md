###  Rounding errors



Most floating-point numbers are only *approximately* correct.
Some numbers, like reasonably-sized integers, can be represented exactly.
But repeating fractions, like $1/3$, and irrational numbers, like $\pi$, cannot.
To represent these numbers, computers have to round off to the nearest floating-point number.



The difference between the number we want and the floating-point number we get is called **rounding error**.
For example, the following two statements should be equivalent:

```code
System.out.println(0.1 * 10);
System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
```

But on many machines, the output is:

```code
1.0
0.9999999999999999
```

The problem is that `0.1`, which is a terminating fraction in decimal, is a repeating fraction in binary.
So its floating-point representation is only approximate.
When we add up the approximations, the rounding errors accumulate.

For many applications, like computer graphics, encryption, statistical analysis, and multimedia rendering, floating-point arithmetic has benefits that outweigh the costs.
But if you need *absolute* precision, use integers instead.
For example, consider a bank account with a balance of \$123.45:

```code
double balance = 123.45;  // potential rounding error
```

In this example, balances will become inaccurate over time as the variable is used in arithmetic operations like deposits and withdrawals.
The result would be angry customers and potential lawsuits.
You can avoid the problem by representing the balance as an integer:

```code
int balance = 12345;      // total number of cents
```


This solution works as long as the number of cents doesn't exceed the largest integer, which is about 2 billion.