The `substring` method returns a new string that copies letters from an existing string, starting at the given index.



*  `fruit.substring(0)` returns `"banana"`
*  `fruit.substring(2)` returns `"nana"`
*  `fruit.substring(6)` returns `""`


The first example returns a copy of the entire string. The second example returns all but the first two characters. As the last example shows, `substring` returns the empty string if the argument is the length of the string. 
Try it out in the left pane. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/Substring.java java -cp code/ Substring )


Like most string methods, `substring` is overloaded. That is, there are other versions of `substring` that have different parameters. If it's invoked with two arguments, they are treated as a start and end index:



*  `fruit.substring(0, 3)` returns `"ban"`
*  `fruit.substring(2, 5)` returns `"nan"`
*  `fruit.substring(6, 6)` returns `""`


Notice that the character indicated by the end index is *not* included. Defining `substring` this way simplifies some common operations. For example, to select a substring with length `len`, starting at index `i`, you could write `fruit.substring(i, i + len)`.