public class DoubleConversion {
    public static void main(String[] args) {
        //Converting pounds to kg
        double pounds = 200;
        double kg = pounds * 0.45359237;
        System.out.println(kg);

        }
}

/*Primitive Data types

- byte data type: when you need to save memory in large arrays where the memory savings are critical, and the values are between -128 and 127.
byte age = 25; // Age of a person

- short small integers data type for numbers from −32,768 to 32,76.
short temperature = -5; // Temperature in degrees

- int integer data type to store whole numbers larger than what byte and short can hold. This is the most commonly used integer type.
int population = 1000000; // Population of a city

- long data type when you need to store very large integer values that exceed the range of int.
long distanceToMoon = 384400000L; // Distance in meters

- float when you need to store decimal numbers but do not require high precision (for example, up to 7 decimal places).
float price = 19.99f; // Price of a product

- double data type when you need to store decimal numbers and require high precision (up to 15 decimal places).
 double pi = 3.141592653589793; // Value of Pi

- char data type when you need to store a single character such as a single letter or an initial.
 char initial = 'A'; // Initial of a person's name

Use boolean when you need to represent a true/false value. Boolean is often used for conditions and decisions.
*/

/*Reference data types

String data type is a sequence of characters. The string data type is very useful for handling text in your programs.
String greeting = "Hello, World!";

array is a collection of multiple values stored under a single variable name.
All the values in an array must be of the same type. Arrays are great for storing lists of items, like student scores or names.
The following code defines an integer array type of scores that include 85, 90, 78, and 92.

int[] scores = {85, 90, 78, 92};
The reference data type class is like a blueprint for creating objects. You can see the class identified in the first line of code.
class Car {
    String color;
    int year;
    void displayInfo() {
    System.out.println("Color: " + color + ", Year: " + year);
    }
}

Objects are classes that contain both data and functions. In this code, Car myCar = new Car(); is the object.
public class Main {
public static void main(String[] args) {
    Car myCar = new Car();
    myCar.color = "Red";
    myCar.year = 2026;
    myCar.displayInfo(); // Output: Color: Red, Year: 2026
    }
}

When you create an interface, you only declare the methods without providing their actual code. All methods in an interface are empty by default. Here's an example of an interface called MyInterfaceClass with three methods.	
// The interface class
interface MyInterfaceClass {
    void methodExampleOne();
    void methodExampleTwo();
    void methodExampleThree();
}

An enum is a special data type that defines a list of named values. An enum is useful for representing fixed sets of options,
such as days of the week or colors.

enum DaysOfWeek {
MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
*/