package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            // Выводим пробелы перед числами
            for (int j = 0; j < cathetusLength - i - 1; j++) {
                System.out.print(" ");
            }

            // Выводим числа перед серединой
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j + " ");
            }

            // Выводим числа после середины
            for (int j = 2; j < i + 2; j++) {
                System.out.print(j + " ");
            }

            // Переходим на следующую строку
            System.out.println();
        }



    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
