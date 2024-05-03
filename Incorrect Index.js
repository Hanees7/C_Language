Strings in JavaScript have zero-based indexing. This means that the first index is 0. It is easy to forget that and use one-based indexing instead. This incorrect indexing leads to another logical error.

Program to print the last character of the string

var str = "Hello";
var len = str.length;  // string's length

console.log(str[len - 1]);   // Correct way to access the n-th character
console.log(str[n]); // incorrect way. It shall print undefined which we'll talk about later. 
Task
Given a function which is supposed to print 1st, 4th and 6th character of a string
Complete its logic.
Sample 1:
Input
Output
hellohowudoing
hlh
OUPUT:
// Debug the following function

function printCharacters(str) {
   console.log(str[0] + str[3] + str[5]);
}

function solve(str) {
   printCharacters(str);
}
