package main.java.com.alevel.alevelClassWorks.findFactorial;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        System.out.println("write what number factorial do you want : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long counter = 1;

        for (int i =2; i<=number; i++){
            counter = counter*(i);
        }
        System.out.println(counter);
    }
}
