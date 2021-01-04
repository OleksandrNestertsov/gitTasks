package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem17;

/*17. Пригодность детали оценивается по размеру B, который должен соответствовать интервалу (A –δ, A + δ).
Определить, имеются ли в партии из N деталей бракованные.
Если да, то подсчитать их количество, иначе выдать отрицательный ответ.*/
public class Problem17 {
    public static void main(String[] args) {
        double[] detailsSize = {50.1, 49.9, 49.1, 50.8, 52.3, 49.9, 50.3};
        int counter = 0;
        for (int i = 0; i < detailsSize.length; i++) {
            if (detailsSize[i] > 49.6 & detailsSize[i] < 50.2) {
                counter += 1;
            }
        }
        if (counter != 0) {
            System.out.println(counter + " normal details");
        } else if (counter == 0) {
            System.out.println("no normal details");
        }
    }
}
