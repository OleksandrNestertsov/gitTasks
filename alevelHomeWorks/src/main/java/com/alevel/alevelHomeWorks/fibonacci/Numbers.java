package main.java.com.alevel.alevelHomeWorks.fibonacci;

public class Numbers {
    boolean num;

    public boolean areFibNumbers(int... numbers) {
        for (int i = 0; i < numbers.length - 2; i++) {

            if (numbers[i] > numbers[i + 1] ||
                    numbers[i + 1] > numbers[i + 2] ||
                    numbers[i] + numbers[i + 1] != numbers[i + 2]) {
                num = false;
                break;
            } else {
                num = true;
            }
        }
        return num;
    }
}