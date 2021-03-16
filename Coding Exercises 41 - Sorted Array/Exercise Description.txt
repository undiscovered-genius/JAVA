Create a program using arrays that sorts a list of integers in descending order.

Descending order is highest value to lowest.

In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.

Set up the program so that the numbers to sort are read in from the keyboard (Scanner).

Implement the following methods: 

getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.

printArray accepts an array and prints out the contents of the array. It should be printed in the following format:

Element 0 contents 106
Element 1 contents 81
Element 2 contents 26
Element 3 contents 15
Element 4 contents 5

sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.

The scenario is:

1. getIntegers() is called.

2. The returned array from getIntegers() is then used to call sortIntegers().

3. The returned array from sortIntegers() is then printed to the console.

[Do not try and implement this. It is to give you an idea of how the methods will be used]

TIP: you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array.

TIP: Instantiate (create) the Scanner object inside the method.

TIP: Be extremely careful about spaces in the printed message.

TIP: Make sure the Scanner class is imported.

NOTE: All methods should be defined as public static NOT public.

NOTE: Do not add a main method to the solution code.