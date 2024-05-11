Loops can execute a block of code as long as a specified condition is reached.
They are handy because they save time, reduce errors, and they make code more readable.

The while loop loops through a block of code as long as a specified condition is true:

while (condition) {
    // code to be executed
}
Example

var counter = 0;
while (counter < 5) {
    console.log("The counter is:", counter);
    counter += 1;
}
In the example above, the 'while' loop is executed as long as the condition 'counter < 5' is true.
The initial value of 'counter' is 0.
The code block inside the loop prints the value of 'counter' and increments it by 1 with the statement 'counter += 1;'.
The loop will continue executing until 'counter' becomes equal to or greater than 5.

Task
Write a program which does the following

Declare a variable a and initialize it to 0
Use the syntax above to create a loop, output the following to the console
Print a in separate lines as long as it is less than 7. Don't print any other text.
Increment a by 1 in each iteration.
OUTPUT:
var counter = 0;
while (counter < 7) {
    console.log(counter);
    counter += 1;
}
