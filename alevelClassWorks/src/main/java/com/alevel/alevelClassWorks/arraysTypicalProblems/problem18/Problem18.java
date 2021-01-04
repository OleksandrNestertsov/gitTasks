package main.java.com.alevel.alevelClassWorks.arraysTypicalProblems.problem18;

import java.util.Arrays;

/*18. У вас есть доллары. Вы хотите обменять их на рубли. Есть информация о стоимости купли-продажи
в банках города. В городе N банков. Составьте программу, определяющую, какой банк выбрать, чтобы
выгодно обменять доллары на рубли.*/
public class Problem18 {
    public static void main(String[] args) {

        double[] rateExchangeBuyDollarsCosts = {25.9, 26.1, 27.1, 25.9, 26.9, 28.5, 24.3, 35.1, 28, 26};
        System.out.println("the buy costs dollars USA in banks : ");
        for (int i = 0; i < rateExchangeBuyDollarsCosts.length; i++) {
            System.out.println("№ " + (i + 1) + " is : " + rateExchangeBuyDollarsCosts[i] + " UAH for 1 dollars USA");
        }
        System.out.println();
        double[] sortedRateExchangeBuyDollarsCosts = Arrays.copyOf(rateExchangeBuyDollarsCosts, rateExchangeBuyDollarsCosts.length);
        Arrays.sort(sortedRateExchangeBuyDollarsCosts);

        //System.out.println(Arrays.toString(rateExchangeBuyDollarsCosts));
        //System.out.println(Arrays.toString(sortedRateExchangeBuyDollarsCosts));

        for (int i = 0; i < rateExchangeBuyDollarsCosts.length; i++) {
            if (rateExchangeBuyDollarsCosts[i] == sortedRateExchangeBuyDollarsCosts[0]) {
                System.out.println(" the best bank to change dollars USA is № :" + (i + 1) + " with rate exchange course : " + rateExchangeBuyDollarsCosts[i]);
            }
        }
    }
}
