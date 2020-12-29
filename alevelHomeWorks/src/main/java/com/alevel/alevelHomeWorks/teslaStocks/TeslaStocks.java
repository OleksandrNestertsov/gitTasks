package main.java.com.alevel.alevelHomeWorks.teslaStocks;

import java.util.Arrays;

public class TeslaStocks {
    public static void main(String[] args) {
        double[] price = {1.5, 5.6, 1.0, 3.6, 6.5, 4.2, 3.6};

        double[] copyPrice = Arrays.copyOf(price, price.length);

        double minPrice;
        double maxPrice;

        Arrays.sort(copyPrice);
        System.out.println(Arrays.toString(price));

        //for (int i = 0; i < copyPrice.length; i++) {
        for (int j = 0; j < price.length; j++) {

            if (copyPrice[0] == price[j]) {
                minPrice = price[j];
                System.out.println("min Price equal :" + minPrice +
                        " the best day to buy Tesla stocks : " + (j + 1));
            }
        }

        for (int i = 0; i < price.length; i++) {
            if (copyPrice[copyPrice.length - 1] == price[i]) {
                maxPrice = price[i];
                System.out.println("max Price equal :" + maxPrice +
                        " the best day to sell Tesla stocks : " + (i + 1));

            }

        }

    }


}

