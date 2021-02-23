package main.java.com.home.tasks.nixPractice.les12;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {24, 13, -1, 2, 4, 70, 44};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int num1 = 0;
                int num2 = 0;
                if (arr[i] <= arr[j]) {
                    num1 = arr[i];
                    num2 = arr[j];
                    arr[j] = num1;
                    arr[i] = num2;
                }
            }
        }
        System.out.println("sorted array : " + Arrays.toString(arr));

        //easy way
        Arrays.sort(arr);
        System.out.println("sorted array : " + Arrays.toString(arr));
    }
}
