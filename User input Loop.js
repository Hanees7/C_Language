Let us change the problem a bit.

Give an incomplete function runLoop(), which takes a number n as its parameter. Write its logic to do the following:

The function should have a variable a initialized to 0.
Use the while syntax to create a loop, and output the following to the console
Print a in separate lines as long as it is less than num.
Increment a by 1 in each iteration.
Sample 1:
Input
Output
10
0
1
2
3
4
5
6
7
8
9
OUTPUT :
// Complete the code

function runLoop(n) {
var a=0;
while(a < n){
    console.log(a)
    a++;
}
}

function solve(n) {
   runLoop(n);
}
