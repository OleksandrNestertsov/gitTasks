package com.alevel.classWorksAlevel.tasks.arrays.backArray;

import java.util.Scanner;

public class BackArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println("write ten int numbers :");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        for (int nameArray : array              //for example foreach
        ) {
            System.out.println(nameArray);

        }
        for (int i = array.length - 1; i > 0; i--) {
            System.out.println(array[i]);
        }


    }

}
