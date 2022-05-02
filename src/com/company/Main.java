package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <GlobalRating.data[i].category.length(); i++) {
            System.out.println(GlobalRating.data[i].category);
            for (int j = 0; j <GlobalRating.data[i].statistic.length; j++) {
                if (j==(GlobalRating.data[i].statistic.length) - 1) {
                    System.out.print(GlobalRating.data[i].statistic[j]);
                } else {
                    System.out.print(GlobalRating.data[i].statistic[j] + " ");
                }
            }
        }
    }

}
