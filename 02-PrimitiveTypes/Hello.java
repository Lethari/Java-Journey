public class Hello {
    public static void main (String[] args) {
        System.out.println("Hello, World!");

    boolean isAlien = false;
    if (isAlien == false) {//If you want both to print use code block ie put code in curly braces
        System.out.println("It is not an Alien!");
        System.out.println("And I am scared of aliens");
    }

    double myFirstValue = 20.00d;
    double mySecondValue = 80.00d;
    double myValuesTotal = (myFirstValue + mySecondValue) * 100d;
    System.out.println("MyValesTotal =" + myValuesTotal);
    double theRemainder = myValuesTotal % 40.00d;
    System.out.println("theRemainder = " + theRemainder);
    boolean isNoRemainder = theRemainder == 0;
    System.out.print("isNoRemainder = " + isNoRemainder);
    if (!isNoRemainder) {
        System.out.println("Got some Remainder");
    }

    }
}
