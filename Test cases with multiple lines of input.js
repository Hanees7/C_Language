In the previous problem, we had 
𝑡
t test cases and each test case had 1 line of input.
However, each test case can have multiple lines of input as well.

Task
Lets write a program in the IDE which performs the following

The 1st line of input is an integer 
𝑡
t - the count of test cases
Each test case consists of 2 lines of input
The 1st line of input has 2 space separated integers - accept them as variables 
𝐴
A and 
𝐵
B
The 2nd line of input has 3 space separated integers - accept them as variables 
𝐶
C, 
𝐷
D and 
𝐸
E
For each test case - output all integers on a single line
Sample 1:
Input
Output
3
1 2
3 4 5
11 22
33 44 55
1 23
456 789 101112
1 2 3 4 5
11 22 33 44 55
1 23 456 789 101112
Explanation:
2 lines of input in test case 1:
1 2
3 4 5

Output 1: 1 2 3 4 5

2 lines of input in test case 2:
11 22
33 44 55

Output 2: 11 22 33 44 55

2 lines of input in test case 3:
1 23
456 789 101112

Output 3: 1 23 456 789 101112
OUTPUT :
process.stdin.setEncoding('utf8');

process.stdin.on('data', function(input) {
    const lines = input.trim().split('\n');
    const testCases = parseInt(lines[0], 10);
    
    let index = 1;
    for(let i = 0; i < testCases; i++) {
       const firstLine = lines[index];
       const secondLine = lines[index + 1];
       const result = firstLine + " " + secondLine;
       console.log(result);
       index += 2;
    }
});
