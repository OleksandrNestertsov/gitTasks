package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem21;

/*21. Дана последовательность действительных чисел a1, a2, ..., аn.
Указать те ее элементы, которые принадлежат отрезку [с, d].*/
public class Problem21 {
    public static void main(String[] args) {
        double[] array = {2.3, 3.6, 1, 5.45, 1.235, 7.3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 1.1&array[i]<=5.5) {

                    System.out.print(array[i] + " ,");
                }
            }


        }
    }
