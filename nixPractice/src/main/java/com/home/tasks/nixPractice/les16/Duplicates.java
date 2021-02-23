package main.java.com.home.tasks.nixPractice.les16;

public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 30, 5, 70, 44,30};
        int duplicatesVal;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] & i != j) {
                    duplicatesVal = arr[i];
                    System.out.println(duplicatesVal);
                }
            }
        }
    }
}
