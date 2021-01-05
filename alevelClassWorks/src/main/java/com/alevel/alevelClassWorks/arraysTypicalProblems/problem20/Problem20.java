package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem20;

import java.util.Arrays;

/*20. Дан одномерный массив A[N]. Найти: mаx(а2, а4, ..., a2k) + min(а1, а3, ..., a2k-1).*/
public class Problem20 {
    public static void main(String[] args) {
        int[] array = {25, 165, 187, 1512, 5, 87, 1, 151, 14, 98, 141, 1, 50, 1000, 151521, 6512, 321, 511, 515, 1522};


        int minNumber = array[1];
        int maxNumber = array[0];

        for (int i = 1; i < array.length - 1; i += 2) {

            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        System.out.println(" min number : " + minNumber);
        System.out.println(" max number : " + maxNumber);
        System.out.println(" max number(а2, а4, ..., a2k) + min number(а1, а3, ..., a2k-1) = " + (maxNumber + minNumber));
    }
}
