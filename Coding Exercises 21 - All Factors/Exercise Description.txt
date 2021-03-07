Write a method named printFactors with one parameter of type int named number. 

If number is < 1, the method should print "Invalid Value".

The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.


EXAMPLE INPUT/OUTPUT:

* printFactors(6); → should print 1 2 3 6

* printFactors(32); → should print 1 2 4 8 16 32

* printFactors(10); → should print 1 2 5 10

* printFactors(-1); → should print "Invalid Value" since number is < 1


HINT: Use a while or for loop.


NOTE: When printing numbers, each number can be in its own line. They don't have to be separated by a space.

For example, the printout for printFactors(10); can be:

1
2
5
10

NOTE: The method printFactors should be defined as public static like we have been doing so far in the course.

NOTE: Do not add a main method to the solution code.