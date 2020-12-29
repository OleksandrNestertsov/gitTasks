package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem2;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 6, 4, 0, 8, 0, 6, 9, 0, 45, 0, 6, 3, 0, 0, 45, 0, 6, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(i + "\t");
            }
        }
    }
}


