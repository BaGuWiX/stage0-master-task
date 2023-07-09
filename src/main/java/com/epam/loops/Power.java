package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        for( int i=0; i< power; i++){
            numberToPrint *= numberToPrint;
        }

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
