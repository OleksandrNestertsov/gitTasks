package main.java.com.alevel.alevelClassWorks.calendarDayNumber;
/*Известно, что первое января - это понедельник.
Год невисокосный.
При данном номере дня в году, вывести месяц, число и день недели.*/

import java.util.Scanner;

public class CalendarDayNumber {
    public static void main(String[] args) {
        System.out.println("January 1 is Monday");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number in year: ");
        int number = scanner.nextInt();
        int day = 0;

        String dayOfMonth[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int dayOfYear[] = new int[365];

        if (number >= 1 && number <= 31) {
            System.out.println("January");
            day = number;
            System.out.println("the number of day :" + day);
        } else if (number >= 32 && number <= 59) {
            System.out.println("February");
            day = number - 31;
            System.out.println("the number of day :" + day);
        } else if (number >= 60 && number <= 90) {
            System.out.println("March");
            day = number - 59;
            System.out.println("the number of day :" + day);
        } else if (number >= 91 && number <= 121) {
            System.out.println("April");
        } else if (number >= 122 && number <= 152) {
            System.out.println("May");
        } else if (number >= 153 && number <= 183) {
            System.out.println("June");
        } else if (number >= 184 && number <= 214) {
            System.out.println("July");
        } else if (number >= 215 && number <= 245) {
            System.out.println("August");
        } else if (number >= 246 && number <= 275) {
            System.out.println("September");
        } else if (number >= 276 && number <= 306) {
            System.out.println("October");
        } else if (number >= 307 && number <= 336) {
            System.out.println("November");
        } else if (number >= 337 && number <= 365) {
            System.out.println("December");
        }


       /* for (int i = 0;i<dayOfMonth.length;i++) {
            System.out.println(dayOfMonth[i]);
        }*/

        if (number % 7 == 1 ||number%7==0) {
            System.out.println(dayOfMonth[0]);
        } else if (number % 7 == 2) {
            System.out.println(dayOfMonth[1]);
        } else if (number % 7 == 3) {
            System.out.println(dayOfMonth[2]);
        } else if (number % 7 == 4) {
            System.out.println(dayOfMonth[3]);
        } else if (number % 7 == 5) {
            System.out.println(dayOfMonth[4]);
        } else if (number % 7 == 6) {
            System.out.println(dayOfMonth[5]);
        } else if (number % 7 == 7) {
            System.out.println(dayOfMonth[6]);



        }

    }
}