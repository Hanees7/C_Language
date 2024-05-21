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
Note: The Sample 1 input values are pre-populated in the Custom inputs below the IDE
Task
You need to do the following

Replace the Custom inputs with Sample test case 2 and click Run to check the result.
You can click the 
𝐶
𝑜
𝑝
𝑦
Copy icon at the top-right of the sample testcases to copy easily.
Replace the Custom inputs with your own created inputs and click Run to check the result.
You can experiment a few more options.
Once done, click on Submit to test your code against the Private test files
Note - Do not forget that the 
1
𝑠
𝑡
1 
st
  integer in the custom inputs has to be 
𝑡
t - the number of test cases
Sample 1:
Input
Output
3
1
2
3
2
3
4
Sample 2:
Input
Output
3
100
200
300
101
201
301
OUTPUT:

process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
    const nums = input.trim().split('\n');
    const n = nums[0];
    for(i = 1; i <= n; i++) {
        console.log(parseInt(nums[i]) + 1);
    }
});
