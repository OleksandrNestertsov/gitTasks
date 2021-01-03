package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem13;

import java.util.Arrays;

/*13. В заданном одномерном массиве поменять местами соседние элементы,
стоящие на четных местах,с элементами, стоящими на нечетных.*/
public class Problem13 {
    public static void main(String[] args) {
        int evenNumber = 0;

        int[] array = {54, 98, -23, 87, 123, 0, -984, 852, 36, -5};
        for (int i = 0; i < array.length - 1; i += 2) {
            if (i % 2 == 0) {
                evenNumber = array[i];
                array[i] = array[i + 1];
                array[i + 1] = evenNumber;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}