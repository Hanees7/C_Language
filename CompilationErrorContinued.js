How do you identify a 'Reference/Compilation error'?

When you run your code and there is an error, you will typically see it in the output.

For example, if you run the below code, you will get a syntax error.

var name = "Bob";
if (name == Bob) {
    consoloe.log(Name); 
}
Error

Uncaught ReferenceError: Bob is not defined
    at <anonymous>:2:13
(anonymous) @ VM1609:2

The error description says that there is an error on line 2. The exact error is explained in the first line of the description: Uncaught ReferenceError: Bob is not defined.

It is clearly saying that we're comparing the string variable name which has the string "Bob" with another variable named Bob instead of comparing it with the string "Bob". The error goes away after adding " (quotes) around Bob in the if statement.

Task
Submit the code present in IDE as it is.
Read the error statement and understand what needs to be fixed.
Fix the code so that it correctly outputs: "Expensive".
OUTPUT :
// Fix the code below so that it can print "Expensive"

var price = 105;
if(price > 100) {
  console.log("Expensive");
}
else {
  console.log("Affordable");
}
