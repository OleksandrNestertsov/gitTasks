package main.java.com.home.tasks.nixPractice.les13;

public class Average {
    public static void main(String[] args) {
        double[] arr = {1, 2, 7, 30, 5, 70, 44};
        double average = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                average += arr[i];
            } else if (arr[i] <= 0) {
                counter += 1;
                average += 0;
            }
        }
        average = average / (arr.length - counter);
        System.out.println(average);
    }
}
