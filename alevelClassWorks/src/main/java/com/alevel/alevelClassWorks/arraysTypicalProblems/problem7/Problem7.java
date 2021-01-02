package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem7;

import java.util.Arrays;
import java.util.Scanner;

/*7. Дана последовательность действительных чисел a1, a2, ..., an.
Заменить все ее члены, большие данного Z, этим числом.
Подсчитать количество замен.*/
public class Problem7 {
    public static void main(String[] args) {

        System.out.println("Write how many sequence of real numbers do you want :");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("write a sequence of " + num + " real int numbers : ");
        int[] sequence = new int[num];
        Scanner sequenceScanner = new Scanner(System.in);
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = sequenceScanner.nextInt();
        }

        System.out.println("write a specified number : ");
        Scanner specifiedNumberScanner = new Scanner(System.in);
        int specifiedNumber = specifiedNumberScanner.nextInt();
        int counter = 0;
        int count = 0;

        for (int seqNumbs : sequence) {
            if (seqNumbs > specifiedNumber) {
                seqNumbs = specifiedNumber;
                count += 1;

            }
            System.out.print(seqNumbs + "\t");
        }
        System.out.println();
        System.out.println("the quantity of change equal : " + count);
        System.out.println("++++++++++++++++++");

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > specifiedNumber) {
                sequence[i] = specifiedNumber;
                counter += 1;
            }
        }
        System.out.println(Arrays.toString(sequence));
        System.out.println("the quantity of change equal : " + counter);
    }
}
