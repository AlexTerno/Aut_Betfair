package Homework;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year between 1900 and 2016: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0);

        System.out.println(year + (isLeapYear ? " is" : " is not") + " a leap year, and February has " + (isLeapYear ? 29 : 28) + " days.");
    }
}
