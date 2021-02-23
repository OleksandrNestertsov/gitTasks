package main.java.com.home.tasks.nixPractice.les7;

public class SumNumbers {
    public static void main(String[] args) {

        int number = 123;
        int numberForCounter = number;
        int numberForArray = number;
        int counter = 1;
        int sum = 0;

        System.out.println(" your number : " + number);

        for (int i = 0; i < number; i++) {

            if (numberForCounter / 10 != 0) {
                numberForCounter = numberForCounter / 10;
                counter += 1;
            } else {
                if (numberForCounter / 10 == 0) break;
            }
        }

        int[] num = new int[counter];
        for (int i = num.length - 1; i >= 0; i--) {
            numberForArray = numberForArray % 10;
            num[i] = numberForArray;
            number = number / 10;
            numberForArray = number;
        }
        for (int sumNum : num) {
            sum += sumNum;
        }

        System.out.println(" sum of all numbers in your number : " + sum);
    }
}

