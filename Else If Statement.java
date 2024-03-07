The 'else if' keyword means "if the previous conditions were not true, then try this condition"

Task
Write a program which does the following

Create integer variables b and r - the marks scored by Bob and Rob
Initialise b and r as b = 23 and r = 45
Compute and output the following to the console
"Rob scored higher marks than Bob." if r is greater than b
"Bob & Rob both scored the same" if both b and r are equal
Update the values of b and r as b = 15 and r = 15
Compute and output the following to the console
"Rob scored higher marks than Bob." if r is greater than b
"Bob & Rob both scored the same" if both b and r are equal
Note: To check if two variables are equal, we use == (equal to) operator.

  OUTPUT :
import java.util.Scanner;


class Codechef
{
    public static void main (String[] args)
    {
        // your code goes here
        int b = 23;
        int r = 45;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");
        }
        
        b = 15;
        r = 15;
        if(r > b){
            System.out.println("Rob scored higher marks than Bob.");
        }
        else if(r == b){
            System.out.println("Bob & Rob both scored the same");
        }
        
    }
}
