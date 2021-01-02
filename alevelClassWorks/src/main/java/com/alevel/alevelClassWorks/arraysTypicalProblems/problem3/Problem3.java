package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem3;

import java.util.Scanner;

/*3. Дана последовательность целых чисел a1, a2, ..., an.
Выяснить, какое число встречается раньше – положительное или отрицательное.*/
public class Problem3 {
    public static void main(String[] args) {

        System.out.println("write how many numbers sequence of int do you want : ");

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        System.out.println("write sequence of int numbers of " + num + " values : ");
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("positive number meets earlier");
                break;
            } else if (arr[i] < 0) {
                System.out.println("negative number meets earlier");
                break;
            } else {
                System.out.println("zero number meets earlier");
                break;
            }
        }
    }
}

