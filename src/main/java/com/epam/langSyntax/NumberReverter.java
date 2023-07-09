package com.epam.langSyntax;

//import java.util.Scanner;

public class NumberReverter {
    int reversedNum =0;

    public void revert(int number) {
        int input = number;
        while(input !=0) {
            reversedNum = reversedNum * 10 + (input % 10);
            input /= 10;
        }
        System.out.println(reversedNum);
    }

   /* public static   void main(String args[]) {
        NumberReverter numberReverter = new NumberReverter();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        numberReverter.revert(input);
    }*/
}

