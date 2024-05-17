In the previous modules, we learnt and practiced simple methods of 
𝑖
𝑛
𝑝
𝑢
𝑡
input and 
𝑜
𝑢
𝑡
𝑝
𝑢
𝑡
output used in programming problems and other programming concepts.

Let us take the next small step and learn about test cases.
You will find the concept of 'test cases' on various programming platforms such as Leetcode, Codeforces, CodeChef, and HackeRrank. What are test cases?

Test cases are multiple Inputs - multiple instances of the same problem, all of which have to be solved by your code correctly.
Example 1: Consider 5 test cases or 5 inputs
11
13
2
4
9
Task
Lets solve a simple problem.
Write a program in the IDE which does the following

Accepts 5 inputs given on 5 separate lines. Each input is an integer 
𝑁
N
For each test cases, prints out the integer 
𝑁
N to console on a separate line (our Input mirror problem)
Sample 1:
Input
Output
11
123
34
22
45
11
123
34
22
45
Explanation:
Since the count of test cases is 5 -> we accept 5 inputs and print 5 outputs
OUTPUT :
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
    const lines = input.trim().split('\n');
    for (let i = 0; i < lines.length; i++) {
        console.log(parseInt(lines[i]));
    }
});
