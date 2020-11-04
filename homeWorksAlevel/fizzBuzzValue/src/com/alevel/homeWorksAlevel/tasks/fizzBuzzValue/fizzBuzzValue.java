package com.alevel.homeWorksAlevel.tasks.fizzBuzzValue;

public class fizzBuzzValue {
    public static void main(String[] args) {
        int num = 347693485;


        int arrayNum[] = new int[9];
        int arrayValue [] =new int[8];


        arrayNum[0] =num%10; //5

        arrayValue [0] = num/10; //34769348
        arrayNum[1] =arrayValue[0]%10;//8

        arrayValue [1] =arrayValue [0]/10 ;//3476934
        arrayNum[2] =arrayValue[1]%10; //4

        arrayValue [2] =arrayValue [1]/10 ;//347693
        arrayNum[3] =arrayValue[2]%10; //3

        arrayValue [3] =arrayValue [2]/10 ;//34769
        arrayNum[4] =arrayValue[3]%10; //9

        arrayValue [4] =arrayValue [3]/10 ;//3476
        arrayNum[5] =arrayValue[4]%10; //6

        arrayValue [5] =arrayValue [4]/10 ;//347
        arrayNum[6] =arrayValue[5]%10; //7

        arrayValue [6] =arrayValue [5]/10 ;//34
        arrayNum[7] =arrayValue[6]%10; //4

        arrayValue [7] =arrayValue [6]/10 ;//3
        arrayNum[8] =arrayValue[7]%10; //3

        for (int i=0;i<arrayNum.length;i++){
            System.out.print(arrayNum[i]);
        }

        System.out.println();

        for (int number: arrayNum){

            if (number%2==0 & number%3!=0){
                System.out.print(number);

            System.out.println(" fizz");}

            else if (number%3==0 & number%2!=0){
                 System.out.print(number);

                System.out.println(" buzz");}

            else if (number%2==0 & number%3==0){
                System.out.print(number);

                System.out.println(" fizzbuzz");
            }
            else if (number%2!=0 & number%3!=0){
                System.out.print(number);
                System.out.println(" noFizzNoBuzz");
            }

            }

        }

    }

