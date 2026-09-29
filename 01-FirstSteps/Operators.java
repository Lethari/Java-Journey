/* Operators in Java
1. Arithmetic Operators - Math Operators:
+ Addition, - Subtraction, * multiplication, /Division, % Modulus (remainder).

int a = 10; (primitive data type)
int b = 3;
System.out.println (a + b); // 13
System.out.println (a * b); // 30
System.out.println (a % b); //1

2. Relational Operators (Compares two values and return true or false)
== Equal to, != Not equal to, < Less than, > Greater than, <= Less than or equal to, >= Greater than or equal to

System.out.println (a == b); //false
System.out.println (a != b); //true
System.out.println (a < b); //false

3.Logical Operators (Used to combine conditional statements)

&& AND, || OR, ! NOT
boolean x = true;
boolean y = false;
System.out.println (x && y); //false
System.out.println (x || y); //true

4. Assignment Operators (Used to assign or update values to variables)

= Assign, += Add and assign, -= Subtract and assign, *= Multiply and assign,
/= Divide and assign, %= Modulus and assign
int c = 5;
c += 3; // c = 8;
c -= 2; // c= 6;
c %= 4; // c =2; (remainder of 6/4 = 2)

5. Unary Operators (Used to perform various operations on a single operand)
++ Increment, -- Decrement, + Positive, - Negative, ! Logical NOT

int n = 5;
n++;
System.out.println(n); //6
n --;
System.out.println(n); //5

6. Ternary Operator (Used to evaluate boolean expressions, short form of if-else statement)
? : Conditional operator
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
System.out.println(result); //Adult
*/

public class Operators {
    public static void main(String[] args) {
        // Example usage of arithmetic operators
        int a = 10;
        int b = 3;
        System.out.println("Addition: " + (a + b)); // 13
        System.out.println("Subtraction: " + (a - b)); // 7
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division: " + (a / b)); // 3
        System.out.println("Modulus: " + (a % b)); // 1

        // Example usage of relational operators
        System.out.println("Equal to: " + (a == b)); // false
        System.out.println("Not equal to: " + (a != b)); // true
        System.out.println("Less than: " + (a < b)); // false
        System.out.println("Greater than: " + (a > b)); // true

        // Example usage of logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y)); // false
        System.out.println("Logical OR: " + (x || y)); // true

        // Example usage of assignment operators
        int c = 5;
        c += 3; // c = 8;
        System.out.println("After += : " + c); // 8
        c -= 2; // c= 6;
        System.out.println("After -= : " + c); // 6
        c %= 4; // c =2; (remainder of 6/4 = 2)
        System.out.println("After %= : " + c); // 2

        // Example usage of unary operators
        
        //prefix increment (increments the value first then prints it)
        int n = 5;
        n++;
        System.out.println("After increment: " + n); // 6
        n--;
        System.out.println("After decrement: " + n); //5

        //postfix increment (print the value first then increment)
        int m = 5;
        System.out.println("Postfix increment: " + m++); // 5
        System.out.println("Value after postfix increment: " + m); // 6


        // Example usage of ternary operator
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary Operator Result: " + result); // Adult
    }
}
