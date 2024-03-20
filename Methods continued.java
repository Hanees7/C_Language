In the previous task you had to compute the square and cube of each number. This can get very long if you have more numbers.

Methods allow you to break down a complex program into smaller, manageable modules.
Each method can represent a specific task or functionality.
Once defined, methods can be reused in different parts of the program or even in different programs, promoting code reuse and saving development time.

Look at the code in the IDE for the previous problem which highlights the implementation of method.
Review the code and click on Submit to proceed.

In the next lesson we will learn about the syntax of methods.

Sample 1:
Input
Output
 
4
8
9
27
16
64
  OUTPUT :
class Codechef
{
    
    public static void squareAndCube(int x) {
        System.out.println(x * x);
        System.out.println(x * x * x);
    }
    
	public static void main (String[] args)
	{
        int a = 2;
        int b = 3;
        int c = 4;
        
        squareAndCube(a);
        squareAndCube(b);
        squareAndCube(c);
	}
}
