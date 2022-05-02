package com.company.TruckingSystem;

public class Order {

    /**
     * This class defines information about logistic orders;
     * @orderNum - order number in the company's CRM system;
     * @quantityOrder - quantity of cargo in the order (tones);
     * @insuranceNeed - the need for cargo insurance;
     * @orderSum - total amount of money in the order ($);
     * @loadAddress - exact load address;
     * @deliveryAddress - exact delivery address;
     * @loadDate - date of cargo loading;
     * @deliveryDate - date of cargo delivery;
     */

    int orderNum;
    int quantityOrder;
    boolean insuranceNeed;
    double orderSum;
    int distance;
    String loadAddress;
    String deliveryAddress;
    String loadDate;
    String deliveryDate;
}
