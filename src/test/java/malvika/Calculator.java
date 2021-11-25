package malvika;

import java.util.Scanner;

public class Calculator {
    double num1;
    double num2;
    static int s;

    private void sum(double num1, double num2) {
        System.out.println("Sum of two numbers is " + (num1 + num2));
    }

    private void diff(double num1, double num2) {
        System.out.println("Difference of two numbers is " + (num1 - num2));
    }

    private void mul( double num1, double num2) {
        System.out.println("Multiplication of two numbers is " + (num1 * num2));
    }

    private void div(double num1, double num2) {
        System.out.println("Division of two numbers is " + (num1 / num2));
    }

    public void doOperations() {
        Scanner sc = new Scanner(System.in);
        Boolean IsContinue = true;
        while (IsContinue) {
            System.out.println("Enter 1 to find the sum of two numbers");
            System.out.println("Enter 2 to find the difference of two numbers");
            System.out.println("Enter 3 to find the multiplication of two numbers");
            System.out.println("Enter 4 to find the division of two numbers");
            System.out.println("Enter 5 to exit");
            System.out.println();
            System.out.println("Enter your Option");
            int userInput = sc.nextInt();
            if (userInput<=4) {
                System.out.println("Now enter any two numbers");
            }
            else
            {
                System.exit(0);
            }
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            switch (userInput) {
                case 1:
                    sum(num1, num2);
                    break;
                case 2:
                    diff(num1, num2);
                    break;
                case 3:
                    mul(num1, num2);
                    break;
                case 4:
                    div(num1, num2);
                    break;
                case 5:
                    IsContinue = false;
                    break;
                default:
                    System.out.println("Please enter the valid option");
            }
            System.out.println("");
        }
    }

}