package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sumOfDigits = 0;

        System.out.print("Please type a number :");
        number = input.nextInt();

        int tempNumber = number;
        while (tempNumber > 9) {
            sumOfDigits += tempNumber % 10;
            tempNumber /= 10;
        }
        sumOfDigits += tempNumber;

        System.out.print("Sum of digits is " + sumOfDigits);
    }
}
