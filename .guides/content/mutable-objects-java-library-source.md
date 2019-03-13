Throughout the book, you have used classes from the Java library including `System`, `String`, `Scanner`, `Math`, `Random`, and others. You may not have realized that these classes are written in Java. In fact, you can take a look at the source code to see how they work.


The Java library contains thousands of files, many of which are thousands of lines of code. That's more than one person could read and understand fully, so don't be intimidated!

Because it's so large, the library source code is stored in a ZIP archive named `src.zip`. Take a few minutes to locate this file on your computer. In the paths below, you'll need to replace “`...`” with the version number.



*  On Linux, it's likely under: `/usr/lib/jvm/openjdk-.../`
<br/> If not, then install the `openjdk-...-source` package.
*  On MacOS, it's likely under: <br/> `/Library/Java/JavaVirtualMachines/jdk.../Contents/Home/`
*  On Windows, it's likely under: `C:\Program Files\Java\jdk...\`


When you open (or unzip) the file, you will see folders that correspond to Java packages. For example, open the `java` folder, and then open the `awt` folder. You should now see `Point.java` and `Rectangle.java`, along with the other classes in the `java.awt` package.

Open `Point.java` in your editor and skim through the file. It uses language features we haven't yet discussed, so you probably won't understand every single line. But you can get a sense of what professional Java source code looks like by browsing through the library.


Notice how much of `Point.java` is documentation (see Appendix 16). Each method is thoroughly commented, including `@param`, `@return`, and other tags. Javadoc reads these comments and generates documentation in HTML. You can see the results by reading the documentation for the `Point` class, which you can find by doing a web search for “Java Point”.

Now take a look at the `Rectangle` class's `grow` and `translate` methods. There is more to them than you may have realized, but that doesn't limit your ability to use these methods in a program. Object-oriented programming makes it possible to hide messy details so that you can more easily use and understand code that other people wrote.