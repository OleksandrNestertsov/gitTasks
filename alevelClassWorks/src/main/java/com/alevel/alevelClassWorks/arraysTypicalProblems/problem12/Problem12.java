package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem12;

/*12. Даны натуральные числа a1, a2, ..., an.
Указать те, у которых остаток от деления на М равен L
(0≤ L ≤ М – 1).*/
public class Problem12 {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 62, 4, 54, 21, 87, 151, 87, 2, 66, 48, 14, 7, 45};
        int l = 2;
        int m = 5;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % m == l) {
                System.out.print(array[i] + "\t");
            }
        }
    }

}