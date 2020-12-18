package com.alevel.homeWorksAlevel.tasks.teslaStocks;

public class TeslaStocksVer2 {
    public static void main(String[] args) {
        double[] price = {1.2, 1.1, 1.9, 1.3, 1.99, 1.8, 1.6};
        double maxPrice = price[0];
        double minPrice = price[0];
        int buyDay = 0;
        int sellDay = 0;


        for (int i = 0; i < price.length; i++) {
            if (price[i] > maxPrice) {
                maxPrice = price[i];
                sellDay = (i+1);
            }
            for (int j = 0; j < price.length; j++) {
                if (price[j] < minPrice) {
                    minPrice = price[j];
                    buyDay = (j+1);
                }


            }

        }

        System.out.println("maxPrice :" + maxPrice + " day : " + sellDay);
        System.out.println("minPrice :" + minPrice + " day : " + buyDay);

        if (sellDay > buyDay) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");


        }


    }
}

