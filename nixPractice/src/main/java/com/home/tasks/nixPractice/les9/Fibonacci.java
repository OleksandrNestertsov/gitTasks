package main.java.com.home.tasks.nixPractice.les9;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int fibNum = 0;
        System.out.println("please, until what number do you want to display a series of Fibonacci numbers ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;
        int num = 1;
        int sum = 0;
        while (sum < number) {
            if (counter == 0) {
                System.out.print(counter + " ");
            }
            if (counter == 1 & num == 1) {
                System.out.print(num + " ");
            }
            sum = counter + num;
            if (sum > number) break;
            System.out.print(sum + " ");
            counter = num;
            num = sum;
        }
    }
}
