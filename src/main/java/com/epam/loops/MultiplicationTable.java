package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(input + " * 1 = " + (input * 1));
        System.out.println(input + " * 2 = " + (input * 2));
        System.out.println(input + " * 3 = " + (input * 3));
        System.out.println(input + " * 4 = " + (input * 4));
        System.out.println(input + " * 5 = " + (input * 5));
        System.out.println(input + " * 6 = " + (input * 6));
        System.out.println(input + " * 7 = " + (input * 7));
        System.out.println(input + " * 8 = " + (input * 8));
        System.out.println(input + " * 9 = " + (input * 9));

    }

}
