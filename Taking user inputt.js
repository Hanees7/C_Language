Now let's take a look, at how multiple lines of input work in JS:

process.stdin.setEncoding('utf8');

process.stdin.on('data', function (input) {
    console.log("The input text is:", input);
});
This JavaScript code listens for input on the standard input stream (stdin). When the user enters multiple lines of text, the 'data' event is triggered once for the input, and the provided callback function logs the complete input to the console.

So no matter how many lines of input is present, all of it becomes available in the input variable at once.

Note, how we are using only one console.log to output 3 lines of text.

Task
Submit the given code in the IDE.
Observe the output.
Sample 1:
Input
Output
JavaScript
is
Fun!
The input text is: JavaScript
is
Fun!
OUTPUT :

process.stdin.setEncoding('utf8');

process.stdin.on('data', function (input) {
    console.log("The input text is:", input);
});
