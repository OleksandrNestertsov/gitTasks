package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem9;

import java.util.Scanner;

/*9. Дан массив действительных чисел, размерность которого N.
 Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.*/
public class Problem9 {
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
        int negativeNumbersCounter = 0;
        int positiveNumbersCounter = 0;
        int zeroNumbersCounter = 0;

        for (int seqNumbs : sequence) {
            if (seqNumbs < 0) {
                negativeNumbersCounter += 1;

            } else if (seqNumbs > 0) {
                positiveNumbersCounter += 1;

            } else if (seqNumbs == 0) {
                zeroNumbersCounter += 1;

            }
        }
        System.out.println("the quantity of negative numbers in the sequence equal : " + negativeNumbersCounter);
        System.out.println("the quantity of positive numbers in the sequence equal : " + positiveNumbersCounter);
        System.out.println("the quantity of zero numbers in the sequence equal : " + zeroNumbersCounter);
    }
}
