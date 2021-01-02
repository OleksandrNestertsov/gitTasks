package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem1;

import java.util.Scanner;
/*1. Дан массив натуральных чисел.
Найти сумму элементов, кратных данному K.*/
public class Problem1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int counter =0;
        System.out.println("write array from 5 int numbers, please: ");
        Scanner array = new Scanner(System.in);
        for (int i =0; i <arr.length; i++){
            arr[i] = array.nextInt();
        }

        System.out.println("write int number K, please: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for (int i=0;i<arr.length;i++){
            if (arr[i]%number==0){
                counter +=arr[i];
            }
        }
        System.out.println("Sum numbers witch divider number K, equal : "+counter);

    }
}
