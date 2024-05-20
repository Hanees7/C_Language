In the previous problem, each testcase had 2 lines of input - each consisting of integers.
Test cases can also contain a combination of integers and strings.

Task
Lets write a program in the IDE which performs the following

The 1st line of input contains 
𝑡
t - the count of testcases
Each testcase consists of the following 
2
2 lines of input
The 1st line of the testcase contains 2 integers - accept them as variables 
𝐴
A and 
𝐵
B
The 2nd line of the testcase contains 1 string - accept it as a variable 
𝑆
S
For each test case, output on one line the 2 integers followed by the string
Sample 1:
Input
Output
2
1 2
abcde
34 567
A1B2C3
1 2 abcde
34 567 A1B2C3
Explanation:
Test case 1:
1 2
abcde

Output for test case 1: 1 2 abcde

Test case 2:
34 567
A1B2C3

Output for test case 2: 34 567 A1B2C3
OUPUT:
process.stdin.setEncoding('utf8');

process.stdin.on('data', function(input) {
    const nums = input.trim().split('\n'); // Remove extra whitespace and split lines
    const testCases = parseInt(nums[0]); // Convert the first line to an integer
    
    for (let i = 1; i <= 2 * testCases; i += 2) {
        let [A, B] = nums[i].split(' ').map(Number); // Extract and convert A and B to numbers
        let S = nums[i + 1]; // Extract the string S
        console.log(`${A} ${B} ${S}`); // Print A, B, and S in the required format
    }
});
