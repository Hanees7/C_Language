Note that there is a difference between Parameters and Arguments.

Parameters are the variables that are listed as part of the method definition. They act like placeholders for the values that the method can accept.

Arguments are the actual values which are passed to the method when you call it.

Check the code template below

a, b are parameters defined in the method
3, 5 are arguments passed to the method
public class Main {
    public static void main(String[] args) {
        int result = addNumbers(3, 5);
        System.out.println("Sum: " + result);
    }

    // User-defined method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
Task
Complete the code in IDE to print a greeting message.
Observe the below sample.

Sample 1:
Input
Output
 
Hello, Alice!
  OUTPUT :
class Codechef
{
	public static void main (String[] args)
	{
        greet("Alice");
    }

    // User-defined method to greet a person by name
    public static void greet(String name) {
        System.out.println("Hello, " + "ALice" + "!");
	}
}
