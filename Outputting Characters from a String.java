We use the concept of indexing to find the position of a character in a string, which means every character in a string corresponds to a number/position called the index number.

               0 1 2 3 4 5 6 7  - index number
     for eg - "C o d e C h e f"
We use the indexOf() method which returns the index (the position) of the first occurrence of a specified text in a string, this also includes whitespaces:

Note - Indexing always starts from 0 when going left to right.

To access the value of a specific character in a string, we refer to the index number, and use the charAt() method.

String myString = "Chaf";
System.out.print(myString.charAt(2));

Output:
a

String myString = "Chaf";
System.out.print(myString.charAt(0));

Output:
C
Task
Write a program which does the following

Create a string variable word and assign the text "Programming" to it
Print the characters o and r from the string word in separate lines using the syntax defined above


  OUTPUT :
  class Codechef
{
	public static void main (String[] args)
	{
		String word = "Programming";
        // Update your code below this line
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));

	}
}
