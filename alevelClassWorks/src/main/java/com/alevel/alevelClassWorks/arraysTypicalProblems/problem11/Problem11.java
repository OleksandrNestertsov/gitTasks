package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem11;

/*11. Даны целые числа a1 a2, .... аn.
Вывести на печать только те числа, для которых выполняется условие аi ≤ i.*/
public class Problem11 {
    public static void main(String[] args) {
        int[] array = {54, 0, 45, -95, 541, 256, -987, 51, 36};
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= i) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
