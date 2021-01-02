package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem4;

import java.util.Scanner;

/*4. Дана последовательность действительных чисел a1, a2, ..., an.
Выяснить, будет ли она возрастающей.*/
public class Problem4 {
    public static void main(String[] args) {
        boolean number =true;

        System.out.println("write how many numbers sequence of int do you want : ");
        Scanner quantity = new Scanner(System.in);
        int num = quantity.nextInt();

        System.out.println("write a sequence of " + num + " int numbers : ");
        Scanner scanner = new Scanner(System.in);
        int[] sequence = new int[num];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] < sequence[i + 1]) {
                number = true;
            } else {
                number = false;
                break;
            }
        }
        if (number) {
            System.out.println("the sequence increases");
        } else {
            System.out.println("the sequence is not increases");


        }
    }
}


