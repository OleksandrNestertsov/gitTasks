package com.alevel.homeWorksAlevel.tasks.bitQuantityCalculation;

public class BitQuantityCalculation {
    public static void main(String[] args) {

        long number =9205646547L;
        long mask = 1;
        int counter=0;
        System.out.println(" Demonstration: the number "+number+ " in binary equal = " +Long.toBinaryString(number));

        if((number&mask) == 0){
        }else {
            counter+=1;
        }

      for (int i =0;i<63;i++){
            mask<<=1;
            if ((number&mask) == 0) {
                }else{
                counter+=1;
            }
        }
        System.out.println("bit quantity in number " +number+ " equal = " +counter);
    }
}