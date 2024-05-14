There are multiple ways to take user input in JavaScript, depending on the context in which your script is running. Here is the most common one:

Standard input (stdin) stream:

This is used almost everywhere because of its simplicity and ease of use.
Example:
    process.stdin.setEncoding('utf8');

    process.stdin.on('data', function (input) {
       console.log(input);
    });
Let's break down the code:

process.stdin.setEncoding('utf8'): This line sets the encoding for the standard input to UTF-8. It ensures that the input is treated as a UTF-8 encoded string, which is a common character encoding.

process.stdin.on('data', function (input) {: This line sets up an event listener for the 'data' event on the standard input stream. The provided callback function will be executed whenever data is received on the standard input.

console.log(input): This line prints the input on the console.

Task
Now, it's your turn to write the code to take input. Copy the above piece of code to take input and write it in editor. Be careful, don't miss any parenthesis or brackets.

Sample 1:
Input
Output
Hello
Hello
OUTPUT :
// Try your code here
process.stdin.setEncoding('utf8');

process.stdin.on('data', function (input) {
  console.log(input);
});
