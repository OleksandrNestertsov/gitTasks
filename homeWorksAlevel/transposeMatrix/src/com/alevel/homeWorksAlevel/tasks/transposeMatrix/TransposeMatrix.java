package com.alevel.homeWorksAlevel.tasks.transposeMatrix;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};

        System.out.println("\n" + "the matrix : " + "\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n" + "the transpose matrix : " + "\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
