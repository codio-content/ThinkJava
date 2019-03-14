You can put as many statements as you like in the `main` method. 

For example, take a look at Hello2.java in the top-left pane which displays more than one line of output. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/Hello2.java java -cp code/ Hello2 )




As this example shows, you can put comments at the end of a line as well as on lines all by themselves.


Phrases that appear in quotation marks are called **strings**, because they contain a sequence of characters strung together in memory. Characters can be letters, numbers, punctuation marks, symbols, spaces, tabs, etc.


`System.out.println` appends a special character, called a **newline**, that moves to the beginning of the next line. 

For example, take a look at Goodbye.java in the bottom-left pane which uses `print` instead of `println` to avoid the newling at the end. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/Goodbye.java java -cp code/ Goodbye )






In this example, the first statement does not add a newline, so the output appears on a single line as `Goodbye, cruel world`. Notice that there is a space at the end of the first string, which appears in the output just before the word cruel.