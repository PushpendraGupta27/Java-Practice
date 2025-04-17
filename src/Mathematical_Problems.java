import java.util.*;

public class Mathematical_Problems {
    static Scanner scn = new Scanner(System.in);

    // Check if a number is even or odd.
    private static void evenOdd() {
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        if (num != 0 && num % 2 == 0) {
            System.out.println(num + " is a Even number");
        } else {
            System.out.println(num + " is a Odd number");
        }
    }

    // Determine if a given year is a leap year.
    private static void leapYear() {
        System.out.print("Enter a year: ");
        int year = scn.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leaF year");
        } else {
            System.out.println(year + " is not a leaf year");
        }
    }


    // Find the greatest of three numbers.
    private static void greatest() {
        // Prompt and read three numbers
        System.out.println("Enter the first number: ");
        int num1 = scn.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scn.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scn.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is greater than" + num2 + "and" + num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is greater than" + num1 + "and" + num3);
        } else {
            System.out.println(num3 + "is greater than" + num1 + "and" + num2);
        }
    }

    public static void main(String[] args) {
        evenOdd();
        leapYear();
    }
}