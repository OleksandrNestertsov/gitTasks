package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem5;

import java.util.Scanner;

/*5. Дана последовательность натуральных чисел a1, a2, ..., an.
Создать массив из четных чисел этой последовательности.
Если таких чисел нет, то вывести сообщение об этом факте.*/
public class Problem5 {
    public static void main(String[] args) {

        int counter = 0;

        System.out.println("write how many natural numbers sequence do you want : ");
        Scanner quantity = new Scanner(System.in);
        int num = quantity.nextInt();


        System.out.println("write a sequence of " + num + " int numbers : ");
        Scanner scanner = new Scanner(System.in);
        int[] sequence = new int[num];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scanner.nextInt();
        }

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] % 2 == 0 & sequence[i] != 0) {
                System.out.print(sequence[i] + "\t");
                counter += 1;
            } else if (sequence[i] == 0) {
                System.err.println("error! natural number cannot equal 0");
                break;
            }
        }
        if (counter == 0) {
            System.out.println("there is no even number in the sequence");
        }
    }
}


