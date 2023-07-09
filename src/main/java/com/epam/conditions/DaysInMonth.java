package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year < 0 || month < 1 || month > 12) System.out.println("invalid date");


        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        int daysInMonth;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                if (isLeapYear) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = -1;
                break;
        }

        if (daysInMonth == -1) {
            System.out.println("Invalid date");
        } else {
            System.out.println("Number of days in " + month + "/" + year + ": " + daysInMonth);
        }
    }
}
