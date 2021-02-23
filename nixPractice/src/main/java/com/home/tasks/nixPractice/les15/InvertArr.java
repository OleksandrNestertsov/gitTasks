package main.java.com.home.tasks.nixPractice.les15;

import java.util.Arrays;

public class InvertArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 30, 5, 70, 44};
        int[] arrInvert = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int counter = j; counter < arrInvert.length; counter++) {
                arrInvert[j] = arr[i];
                j += 1;
                break;
            }
        }
        System.out.print("don't invert array : ");
        System.out.println(Arrays.toString(arr));
        System.out.print("invert array : ");
        System.out.println(Arrays.toString(arrInvert));
    }
}
