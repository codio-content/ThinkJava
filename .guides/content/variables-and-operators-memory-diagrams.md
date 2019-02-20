Because Java uses the `=` symbol for assignment, it is tempting to interpret the statement `a = b` as a statement of equality.
It is not!

Equality is commutative, and assignment is not.
For example, in mathematics if $a = 7$ then $7 = a$.
In Java `a = 7;` is a legal assignment statement, but `7 = a;` is not.
The left side of an assignment statement has to be a variable name (storage location).

Also, in mathematics, a statement of equality is true for all time.
If $a = b$ now, $a$ is always equal to $b$.
In Java, an assignment statement can make two variables equal, but they don't have to stay that way.

```code
int a = 5;
int b = a;     // a and b are now equal
a = 3;         // a and b are no longer equal
```

The third line changes the value of `a`, but it does not change the value of `b`, so they are no longer equal.


Taken together, the variables in a program and their current values make up the program's **state**.
Figure 0.1 shows the state of the program after these assignment statements run.

![Figure 3.1 Memory diagram of the variables `a` and `b`.](figs/state.jpg)

**Figure 3.1 Memory diagram of the variables `a` and `b`.**


Diagrams like this one that show the state of the program are called **memory diagrams**.
Each variable is represented with a box showing the name of the variable on the outside and the value inside.
As the program runs, the state of memory changes, so memory diagrams only show a particular point in time.