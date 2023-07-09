package com.epam.langSyntax;

//import java.util.Scanner;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int input = number;
        int sum = 0;

        while (input != 0) {
            sum += input % 10;
            input /= 10;
        }
        System.out.println(sum);
    }

    /*public static void main(String args[]) {
        DigitsSumCalculator d = new DigitsSumCalculator();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        d.calculateSum(number);
    }*/
}
