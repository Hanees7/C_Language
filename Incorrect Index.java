As our string uses zero-based indexing, many times we forget about it and write logic using one-based indexing, which gives us the wrong answer. This incorrect indexing gives you a logical error.

Program to print the last character of the string

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Input length of the string

        String s = scanner.next(); // Input string
        System.out.println(s.charAt(n-1)); // Correct way
        System.out.println(s.charAt(n));  // Incorrect way
        scanner.close();
    }
}

Task
Give a program to print 1st, 4th and 6th character of a string
Find out the logical error and solve it
Sample 1:
Input
Output
hellohowudoing
hlh
OUTPUT:

import java.util.*;

class Codechef{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); // Input string
        scanner.close();

        if (s.length() > 6) {
            
            // correct the indexing from one based to zero based
            char c1 = s.charAt(0); 
            char c2 = s.charAt(3);
            char c3 = s.charAt(5);

            System.out.println("" + c1 + c2 + c3);
        } else {
            // Handle the case when indices are out of bounds
            System.out.println("Invalid indices"); 
        }
    }
}
