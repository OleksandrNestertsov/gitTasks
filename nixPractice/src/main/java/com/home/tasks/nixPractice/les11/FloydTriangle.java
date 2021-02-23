package main.java.com.home.tasks.nixPractice.les11;

public class FloydTriangle {
    public static void main(String[] args) {
        int number = 5;
        int counter = 0;

        outer:
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                counter += 1;
                System.out.print(counter + " ");
            }
        }
    }
}