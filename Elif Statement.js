In the cases, where you have to check for multiple conditions and run some code based on each, you have to use else if( ).

The else if( ) keyword means "if the previous conditions were not true, then try this condition".

The following example illustrates the usage of else if( ).

grade = 85;

if (grade >= 90) {
    console.log("You got an A");
} else if(grade >= 80) {
    console.log("You got a B");
} else {
    console.log("You got a C");
}

// Output:
// You got a B
The code above works as follows

If grade >= 90, then it will output: You got an A
If the grade is between 80 and 90 - it will output: You got a B
If the grade is less than 80 - it will output: You got a C
Task
Write a program which does the following

Take two integers b and r as input
Print "Rob scored higher marks than Bob", if r is greater than b
Print "Bob & Rob both scored the same", if both b and r are equal
Print "Bob scored higher marks than Rob", otherwise.
Sample 1:
Input
Output
20
25
Rob scored higher marks than Bob
Sample 2:
Input
Output
15
15
Bob & Rob both scored the same
OUTPUT :
// Complete the given function to get the desired output

function solve(r, b) {
 if(r>b){
     console.log("Rob scored higher marks than Bob");
 }
 else if(b == r){
     console.log("Bob & Rob both scored the same")
 }
 else{
     console.log("Bob scored higher marks than Rob")
 }
}
