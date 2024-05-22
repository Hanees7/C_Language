What is the difference between the Run and Submit buttons?

Run allows you to locally test your code on sample inputs and custom inputs
Custom inputs are small inputs - mainly for you to test your code
Submit sends your code to the online judge to compare your Actual output and the Expected output
On submission - your code is checked against thousands of test cases which are included in the hidden or private test files
Your code / solution is complete only when you click Submit and get an AC (accepted) verdict
Note: Your code can run as expected for your custom inputs - however, it can fail on the private test files.
This means your code is NOT solving the problem correctly and needs to be fixed.
Task
You are given a program which does the following

Accepts the count of test cases - 
𝑡
t - in the 1st line.
First line of each test case consists of an integer 
𝑁
N
Outputs the integer which is greater than 
𝑁
N by 
1
1
Click on Run to check the result on custom inputs
Click on Submit to check the final verdict
Sample 1:
Input
Output
3
5
11
15
6
12
16
OUTPUT :
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
    const nums = input.trim().split('\n');
    const t = parseInt(nums[0]); // parse the count of test cases correctly
    for(let i = 1; i <= t; i++) { // loop through the test cases
        console.log(parseInt(nums[i]) + 1); // parse each test case input and add 1
    }
});
