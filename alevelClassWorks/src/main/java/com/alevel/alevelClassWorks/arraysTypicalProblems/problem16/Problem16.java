package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem16;

import java.util.Arrays;

/*16. В одномерном массиве размещены: в первых элементах значения аргумента, в следующих –
соответствующие им значения функции. Напечатать элементы этого массива в n параллельных столбцов
(аргумент и значения функции).*/
public class Problem16 {
    public static void main(String[] args) {
        int [] array = new int[18];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000000000);
        }
        System.out.println(Arrays.toString(array));
        for (int i =0 ;i< array.length-1;i+=2){
            System.out.println(array[i] +" "+ array[i+1] );

        }

    }
}
