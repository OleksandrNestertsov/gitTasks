package main.java.com.alevel.alevelClassWorks.equalsGCDLCM.findingGCD;

import java.util.Scanner;

public class FindingGCD {
    public static void main(String[] args) {
        System.out.println("write two natural numbers : ");
        Scanner scanner = new Scanner(System.in);
        long number1 = scanner.nextLong();
        long number2 = scanner.nextLong();

        while (number1!=0 & number2!=0){
            if (number1>number2){
                number1= number1%number2;
            }else{
                number2= number2%number1;
            }
        }
            System.out.println("GCD equal : " + (number1+number2) );
    }
}
