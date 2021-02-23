package main.java.com.home.tasks.nixPractice.les17;

public class Crossing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 30, 5, 70, 44};
        int[] arr1 = {1, 4, 17, 30, 28, 99};
        int crossingVal = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    crossingVal = arr[i];
                    System.out.print(crossingVal + ",");
                }
            }
        }
    }
}
