JavaScript operators are symbols or keywords that perform operations on variables and values. We'll talk more about it in later modules, for now, let's have a look at some of the prominent comparison operators which are used extensively in the if( ) condition:

Comparison Operators
== (equality): Checks if two values are equal.
!= (inequality): Checks if two values are not equal.
=== (strict equality): Checks if two values are equal without type conversion.
!== (strict inequality): Checks if two values are not equal without type conversion.
> (greater than), < (less than), >= (greater than or equal to), <= (less than or equal to): Compare numeric values.
//Some examples:
var adultAge = 18;
var age = 11;
if(age >= adultAge){ // condition is false
  console.log("Adult");
} else {
  console.log("Minor"); // Minor will be printed
}


if (10 === '10') {  // condition is false (strict equality)
  console.log("Types are equal");
} else{
  console.log("Types are not equal"); // this would be the output
}


if(10 == '10'){  // true
  console.log("Values are equal"); // this would be the output
} else {
  console.log("Not equal");
}

If notice the last example, the the condition (10 == '10) is true. The == operator performs type coercion if the operands are of different types. Meaning, it compares values after attempting to convert them to a common type. In this example, JavaScript converts the string to a number before making the comparison.

Task
Write a program to check whether the length of the string CodeChef is less than 5 or greater.

If the length is greater than 5 print Long String
If it's less than or equal to 5 print Short String
OUTPUT :
// your code goes here
var a="CodeChef";
if(a.length > 5){
    console.log("Long String");
}else{
    console.log("Short String");
}
