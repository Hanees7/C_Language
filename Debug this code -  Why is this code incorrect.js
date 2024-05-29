Now try and debug this problem.

You are given a program in the IDE which is trying to do the following

Accepts the count of test cases - 
𝑡
t - in the 1st line
Each line of test case consists of an integer 
𝑁
N
For each test case, it is supposed to print double the integer 
𝑁
N as the output
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
OUTPUT:
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
    const nums = input.split('\n');
    const testCases = parseInt(nums[0]);
    for(let i = 1; i <= testCases; i++) {
      var num = parseInt(nums[i]);
      console.log(2 * num);
    }
});
