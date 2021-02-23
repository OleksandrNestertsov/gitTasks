package main.java.com.home.tasks.nixPractice.les5;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 7, 15};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
