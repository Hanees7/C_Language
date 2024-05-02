We saw two different syntax errors in the last lessons. There are many different types of syntax errors, but they are generally easiest to debug as the error description clearly explains what needs to be fixed.

Let us now learn about Runtime errors

Runtime error
A runtime error occurs when your syntax is correct but the compiler (or interpreter in case of JavaScript), is still not able to run the code due to an error.

Example:

const pi = 3.14;
pi = 3.14159; //TypeError (one of the runtime errors)
If you run the above code, you will get this error.

Uncaught TypeError: Assignment to constant variable.
    at <anonymous>:2:4
There is an error in line 2 because we are trying to re-assign a new value to a constant variable which is not possible.

Task
There is a buggy function present in IDE, which takes two numbers as parameters.
If you run the code, based on the input number it should store either Equal or Not Equal, in the string variable isEqual then print this value of the variable.
Try to fix it.
Sample 1:
Input
Output
1 2
Not Equal
Sample 2:
Input
Output
3 3
Equal
OUTPUT :
// Debug/Fix the given function

function solve(num1, num2) {
  let isEqual = "Equal";
  if(num1 === num2) {
     isEqual = "Equal";
  } else {
     isEqual = "Not Equal";
  }
  console.log(isEqual);
}
