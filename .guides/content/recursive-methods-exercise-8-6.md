**Exercise 8.6:**

Many of the patterns we have seen for traversing arrays can also be written recursively.
It is not common, but it is a useful exercise.



1.  Write a method called `maxInRange` that takes an array of integers and two indexes, `lowIndex` and `highIndex`, and finds the maximum value in the array, but only considering the elements between `lowIndex` and `highIndex`, including both.

This method should be recursive.
If the length of the range is 1, that is, if `lowIndex == highIndex`, we know immediately that the sole element in the range must be the maximum.
So that's the base case.

If there is more than one element in the range, we can break the array into two pieces, find the maximum in each of the pieces, and then find the maximum of the maxima.

1.  Methods like `maxInRange` can be awkward to use.
To find the largest element in an array, we have to provide the range for the entire array.

```code
double max = maxInRange(a, 0, a.length - 1);
```

Write a method called `max` that takes an array and uses `maxInRange` to find and return the largest element.