package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem6;

import java.util.Arrays;
import java.util.Scanner;

/*6. Дана последовательность чисел a1, a2, ..., an.
Указать наименьшую длину числовой оси, содержащую
все эти числа.*/
public class Problem6 {
    public static void main(String[] args) {

        System.out.println("write how many numbers sequence of int do you want : ");
        Scanner quantity = new Scanner(System.in);
        int num = quantity.nextInt();

        System.out.println("write a sequence of " + num + " int numbers : ");
        Scanner scanner = new Scanner(System.in);
        int[] sequence = new int[num];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scanner.nextInt();
        }

        Arrays.sort(sequence);
        int minAxis = sequence[sequence.length-1] - sequence[0];
        System.out.println("The sorted sequence equal : " + Arrays.toString(sequence));
        System.out.println("The smallest length of a numeric axis equal : " + minAxis);
    }
}
