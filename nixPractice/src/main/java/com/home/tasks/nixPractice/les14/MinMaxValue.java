package main.java.com.home.tasks.nixPractice.les14;

public class MinMaxValue {
    public static void main(String[] args) {
        int[] arr = {24, 13, -1, 2, 4, 70, 44};
        int minVal = arr[0];
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        System.out.println("min : " + minVal);
        System.out.println("max : " + maxVal);
    }
}
