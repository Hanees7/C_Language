Similar to what we saw in slicing of strings, you can slice arrays as well.
You can specify a range of consecutive indexes by specifying where to start and where to end the range in this manner - console.log(arr.slice(1, 4));.
This will print elements from index number 1 to 3.

Note:

Indexing starts from 0.
Item on index no 4 will not be printed as the end index is excluded.
For eg -

arr = ["Juke", "King", "Hearts", "68", "Kite"];
console.log(arr.slice(1, 4));
The output will be

["King", "Hearts", "68"]
Write a program which does the following:

Create a list months of the first 7 months in a year
Output the following to the console on separate lines
Print the first 6 months of the year
Print the 2nd to 5th month of the year - both 2nd and 5th included
OUTPUT :
// Update the code below to solve the problem

var months = ["January", "February", "March", "April", "May", "June", "July"]
console.log(months.slice(0,6));
console.log(months.slice(1,5));
