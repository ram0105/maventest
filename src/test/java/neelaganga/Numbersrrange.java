package neelaganga;

import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class Numbersrrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int sortedNumber = 0;
        /*
         * This loop checks for each digit starting from 0 to 9.
         * In case of ascending order it should be 0 to 9.
         */
        for (int i = 9; i >= 0; i--) {
            int tmpNumber = number;
            while (tmpNumber > 0) {
                int digit = tmpNumber % 10;
                // Check for the greatest digit in the given number
                if (digit == i) {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
    }
}