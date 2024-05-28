So as you solve programming problems - you will need to debug and find errors in your own code.

Task
You are given a program which does the following

Accepts the count of test cases - 
𝑡
t - in the 1st line
The only line of each test case consists of an integer  
𝑁
N
For each test case, output to the console the value that is double the integer 
𝑁
N
Can you try and debug / fix the error in the given program?

Sample 1:
Input
Output
3
1
2
3
2
4
6
OUTPUT :
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
    const nums = input.trim().split('\n');  // Using trim() to remove any extra newline characters
    const testCases = parseInt(nums[0]);   // Converting testCases to an integer
    for(let i = 1; i <= testCases; i++) {  // Starting loop from 1
      var num = parseInt(nums[i]);
      console.log(2 * num);
    }
    
});
