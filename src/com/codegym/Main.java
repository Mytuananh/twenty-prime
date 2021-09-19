package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the prime numbers: ");
        int number = scanner.nextInt();
        int count = 1;
        int num = 2;
        if (number >= 1) {
            System.out.println(number + " is the prime numbers: ");
        }
        for (int i = 1; i <= number;) {
            for (int j = 2; j <= Math.sqrt(num) ; j++) {
                if (num % j == 0) {
                    count = 0;
                    break;
                }
            }
            if (count != 0) {
                System.out.print(num + ", ");
                i++;
            }
            count = 1;
            num++;
        }
    }
}