Taking multi-line inputs

Let's look at how multiple lines of inputs are taken in JavaScript. Please take a look at the code in the IDE.

process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
    const nums = input.trim().split('\n');
    let x = parseInt(nums[0]);
    let y = parseInt(nums[1]);
    // Complete the code
});
You might be wondering, what does the following line of code do. Let's break it down.

    const nums = input.trim().split('\n');
Here, the input received from the user is first trimmed using the inbuilt JavaScript string method trim() to remove any leading or trailing whitespace. Then, it is split into an array using split('\n') (another string method in JavaScript). This assumes that the input contains two newline-separated values (perhaps entered as two separate lines). Note that, the character sequence '\n' represents a newline character. It is an escape sequence that is used to denote the end of a line in a string.

The resulting array, nums, will contain two elements, where nums[0] is the first entered value, and nums[1] is the second entered value.

Task
Complete the given program which should do the following:

Take two integer inputs, each on a separate line.
Calculate their sum and difference.
Output sum and difference to the console on separate lines.
Sample 1:
Input
Output
35
23
58
12
OUTPUT:
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(input) {
    const nums = input.trim().split('\n');
    let x = parseInt(nums[0]);
    let y = parseInt(nums[1]);
    // Complete the code
    console.log(x+y);
    console.log(x-y);
    
});
