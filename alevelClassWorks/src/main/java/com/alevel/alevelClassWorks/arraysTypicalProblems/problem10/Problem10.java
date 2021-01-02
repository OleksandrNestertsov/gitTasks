package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem10;

import java.util.Arrays;

/*10. Даны действительные числа a1, a2, ..., an.
Поменять местами наибольший и наименьший элементы.*/
public class Problem10 {
    public static void main(String[] args) {
        int[] array = {5, 44, -8, 36, 98, 448, 0, 41};
        System.out.println("the sequence of real numbers equal : " + "\n" + Arrays.toString(array)+ "\n" );

        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);
        //System.out.println("the sorted sequence of real numbers equal : " + "\n" +Arrays.toString(copyArray)+ "\n" );

        int minNumber = copyArray[0];
        int maxNumber = copyArray[copyArray.length-1];
        System.out.println("maxNumber : "+ maxNumber + " \n" +"minNumber : "+ minNumber+"\n");

        for (int i =0; i<array.length;i++){
            if (array[i]==maxNumber){
                array[i]=minNumber;
            }else if (array[i]==minNumber){
                array[i]=maxNumber;
            }

        }
        System.out.println("the sequence of real numbers with changed min and max values equal : "+ "\n"  + Arrays.toString(array));

    }
}
