What will be the value of x after the following statement?

public class Main {
    public static void main(String[] args) {
        int x = 7;
        x *= 3;
        System.out.println(x);
    }
}
OUTPUT :
Correct Answer:

21
Explanation:
The x *= 3; statement is a compound assignment operator. It is shorthand for x = x * 3;. So, it multiplies the current value of x by 3 and assigns the result back to x.

Initially, x is assigned the value 7. Then, x is multiplied by 3, resulting in 21. Finally, the value of x, which is now 21, is printed to the console.
