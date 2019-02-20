Before introducing the next recursive example, we need to discuss how integers are represented by a computer.

You are probably aware that computers can only store 1's and 0's.
That's because, at the end of the day, processors and memory are made up of billions of tiny on-off switches.

The value 1 means a switch is on; the value 0 means a switch is off.
All types of data, whether integer, floating-point, text, audio, video, or something else, need to be represented by 1's and 0's.


Fortunately, mathematicians solved this problem centuries ago.
We can represent any integer as a **binary** number.
The following table shows the first eight numbers in binary and decimal (the number system we normally use).

|Binary|Decimal |
|-|-|
|0|0 |
|1|1 |
|10|2 |
|11|3 |
|100|4 |
|101|5 |
|110|6 |
|111|7 |


In the decimal system, each part of a number is referred to as a “digit”.
For example, the number 456 has three digits.
In the binary system, each part of a number is referred to as a “bit”.
The number 10111 in binary has five bits.

When you hear the phrase “64-bit computer”, it means that the processors and memory use 64 bits to store integers.
That is where the limits for data types like `int` and `long` come from.

Decimal numbers are based on powers of 10, because there are 10 possible values for each digit.
For example, the number 456 has 6 in the 1's place, 5 in the 10's place, and 4 in the 100's place.
So the value is 400 + 50 + 6.

|4|5|6 |
|-|-|-|
|$10^2$|$10^1$|$10^0$ |


Binary numbers are based on powers of 2, because there are 2 possible values for each bit.
For example, the number 10111 has 1 in the 1's place, 1 in the 2's place, 1 in the 4's place, 0 in the 8's place, and 1 in the 16's place.
So the value is 16 + 0 + 4 + 2 + 1, which is 23 in decimal.

|1|0|1|1|1 |
|-|-|-|-|-|
|$2^4$|$2^3$|$2^2$|$2^1$|$2^0$ |


To convert from decimal to binary, we simply need to divide the number by two repeatedly until we reach zero.
When you divide by two, the remainder will be either 0 or 1.
If you keep track of the remainders, you'll have your binary number.

```code
23 / 2 is 11 remainder 1
11 / 2 is  5 remainder 1
 5 / 2 is  2 remainder 1
 2 / 2 is  1 remainder 0
 1 / 2 is  0 remainder 1
```

Reading these remainders from bottom to top, 23 in binary is 10111.