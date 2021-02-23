package main.java.com.home.tasks.nixPractice.les6;

public class TempConvert {
    public static void main(String[] args) {
        int tempFar = 41;
        int tempCells;

        tempCells = (int) ((tempFar - 32) / 1.8);
        System.out.println("temperature in fahrenheit : " + tempFar);
        System.out.println("temperature in celsius  : " + tempCells);
    }
}