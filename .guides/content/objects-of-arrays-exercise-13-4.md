You can learn more about the sorting algorithms in this chapter, and others, at [http://www.sorting-algorithms.com/](sorting-algorithms.com). This site provides explanations of the algorithms and animations that show how they work. It also includes an analysis of their efficiency.

For example, “insertion sort” is an algorithm that inserts elements into place, one at a time. Read about it at [http://www.sorting-algorithms.com/insertion-sort](http://www.sorting-algorithms.com/insertion-sort). Then write a method named `insertionSort` that implements this algorithm.

One goal of this exercise is to practice top-down design. Your solution should use a helper method, named `insert`, that implements the inner loop of the algorithm. `insertionSort` should invoke this method $n-1$ times.

{Run!}(sh .guides/bg.sh javac code/ch13/Deck.java java -cp code/ch13/ Deck )
