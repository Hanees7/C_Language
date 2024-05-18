In the previous problem - we wrote the program to accept 5 inputs on 5 separate lines.

What will we do if we expect 100 inputs or test cases?
What about 100,000 inputs or test cases?
Task
Lets solve a simple problem.
Write a program in the IDE which does the following

Accepts the count of test cases - 
𝑡
t - as an integer input given in the 1st line.
This is followed by 
𝑡
t lines - Each line contains an integer 
𝑁
N
For each test cases, prints out the integer 
𝑁
N to console on a separate line (our Input mirror problem)
Sample 1:
Input
Output
3
1
22
33
1
22
33
Explanation:
Since the count of test cases is 3 -> we accept 3 inputs and print 3 outputs
OUTPUT :
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
    const lines = input.trim().split('\n');
    const tests = parseInt(lines[0]);  // Convert the first line to an integer
    for(let i = 1; i <= tests; i++){  // Use 'let' for block-scoped variable
        console.log(lines[i]);  // Print each subsequent line
    }
});
