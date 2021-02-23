package main.java.com.home.tasks.nixPractice.les10;

public class RandomGenerator {
    public static void main(String[] args) {
        int number = ((int) (Math.random() * 7) + 1);
        System.out.println(" The random number equal : " + number);
        System.out.print(" The day of week which equal random number : ");
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}