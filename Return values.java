Functions in Java can serve two primary purposes when it comes to providing information to the caller: they can either return a value or print an output.

Returning Values from Functions:
When a function returns a value, it provides a piece of data back to the caller.
This data can be used for further processing, assignment to variables, or any other purpose within the program. The return statement is used to send a value back to the caller.

Check the sample below

public class Main {
    public static void main(String[] args) {
        int result = calculateSquare(5);
        System.out.println("Square of 5: " + result);
    }

    // User-defined method to calculate the square of a number
    public static int calculateSquare(int num) {
        int squareResult = num * num;
        return squareResult;
    }
}

// Output:
// Square of 5: 25
Printing Output from Functions:
A function can also directly print output to the console using print statements.
However, this doesn't provide any data back to the caller in a way that can be used elsewhere in the program.
The primary purpose here is to display information, not to provide data for further processing.

Check the example below which gives the same output as the code above

public class Main {
    public static void main(String[] args) {
        printSquare(5);
    }

    // User-defined method to print the square of a number
    public static void printSquare(int num) {
        int squareResult = num * num;
        System.out.println("Square of " + num + " is: " + squareResult);
    }
}

// Output:
// Square of 5 is: 25
Task
Update the method given in the IDE to output the following to the IDE by printing from inside the function.

�
2
+
2
∗
�
∗
�
+
�
2
A 
2
 +2∗A∗B+B 
2
 
�
+
�
A+B
Check sample output below.

Sample 1:
Input
Output
3 5
2 7
4 1
64
8
81
9
25
5
OUTPUT :

import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int t = 3; 

        for (int i = 0; i < t; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            computeValue(A, B);
        }

        scanner.close();
    }

    // User-defined method to compute and print values
    public static void computeValue(int a, int b) {
        //complete the function
        System.out.println(a * a + 2 * a * b + b * b);
    System.out.println(a + b);

	}
}
