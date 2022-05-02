package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <GlobalRating.data[i].category.length(); i++) {
            System.out.println(GlobalRating.data[i].category[i]);
            for (int j = 0; j <GlobalRating.data[i].statistic[j]; j++) {
                System.out.println(GlobalRating.data[i].statistic[j]);
            }
        }

        System.out.println(Arrays.toString(GlobalRating.data[0].statistic));
        System.out.println(Arrays.toString(GlobalRating.data[1].statistic));
        System.out.println(Arrays.toString(GlobalRating.data[2].statistic));
        System.out.println(Arrays.toString(GlobalRating.data[3].statistic));
    }
}
