package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem14;

import java.util.Arrays;

/*14. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене, ко второму не
допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
Подсчитать, сколько человек не допущено ко второму экзамену.*/
public class Problem14 {
    public static void main(String[] args) {
        int counterNotAdmitted = 0;
        int counterAdmitted = 0;
        int[] grade = new int[20];
        for (int i = 0; i < grade.length; i++) {
            grade[i] = ((int) (Math.random() * 5) + 1);
        }
        for (int gradeRate : grade) {
            if (gradeRate <= 2) {
                counterNotAdmitted += 1;
            } else if (gradeRate >= 3) {
                counterAdmitted += 1;
            }
        }
        System.out.println(Arrays.toString(grade));
        System.out.println(counterNotAdmitted + " applicants are not admitted to the second exam");
        System.out.println(counterAdmitted + " applicants are admitted to the second exam");
    }
}