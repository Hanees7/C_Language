Let us now solve some programming problems. Note that

In the IDE - the '#' - comments will give you hints about what you need to do
The Solution tab also has '#' - comments which give you helpful information
Task
Write a program in the IDE which does the following

Accepts the count of test cases - 
𝑡
t - in the 1st line
The only line of each test case consists of an integer 
𝑁
N
You need to generate the following output - Change the sign of 
𝑁
N.
That is, if the input is 
4
4, output 
−
4
−4. If the input is 
−
5
−5, output 
5
5.
Sample 1:
Input
Output
5
1
2
3
-4
-5
-1
-2
-3
4
5
OUTPUT:
process.stdin.setEncoding('utf8');

process.stdin.on('data', function(input) {
    const nums = input.trim().split('\n'); // Split the input by new lines
    const t = parseInt(nums[0]); // First line is the number of test cases
    for(let i = 1; i <= t; i++) { // Loop through each test case
        const N = parseInt(nums[i]); // Parse the integer value of the test case
        console.log(-N); // Output the negated value of N
    }
});
