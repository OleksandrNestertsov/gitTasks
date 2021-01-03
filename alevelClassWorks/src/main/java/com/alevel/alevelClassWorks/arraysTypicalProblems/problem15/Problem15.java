package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem15;

/*15. Дана последовательность чисел, среди которых имеется один нуль.
Вывести на печать все числа, включительно до нуля.*/
public class Problem15 {
    public static void main(String[] args) {

        int[] sequence = {4, 8, -10, 58, 48, 98, 0, -2, 36, 8, 56};
        for (int seq : sequence) {
            if (seq != 0) {
                System.out.print(seq + "\t");
            } else if (seq == 0) {
                break;
            }
        }
    }
}
