package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem19;

/*19. Дан целочисленный массив с количеством элементов n. Напечатать те его элементы, индексы
которых являются степенями двойки (1, 2, 4, 8, 16, ...).*/
public class Problem19 {
    public static void main(String[] args) {
        int[] array = {12, 335, 44, 54, 84, 14, 2, 57, 8, 0, 484, 0, 4541, 14, 47, 621, 1446, 46484, 565447, 454, 44
                , 4454, 54, 545, 44, 4, 8484, 54, 54, 4, 686, 5465, 9, 565, 6484684, 6, 65, 45, 447};



        for (int i = 1; i < array.length; i++) {
            int counter = 0;
            int mask = 1;
            if ((i & mask)==0) {
            }else {
                counter+=1;
            }
            for (int j=0;j<31;j++){
                mask<<=1;
                if ((i & mask)==0) {
                }else {
                    counter+=1;
            }



            }
            if (counter == 1)
                System.out.println(" number : " + i + " value : " + array[i]);

        }

    }


}

