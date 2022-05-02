package com.company.OnlineShop;

public class Order {

    /**
     * This class defines information about delivery orders;
     * @orderNum - order number in the company's CRM system;
     * @quantityOrder - quantity of products in the order;
     * @testNeed - the need to test the product when delivering the product on site;
     * @orderSum - total amount of money in the order ($);
     * @courierName - full name of the courier, who delivers the order;
     * @deliveryType - delivery type: auto courier, bicycle courier, postal services, drone delivery, etc.;
     * @deliveryAddress - exact delivery address;
     * @addInfo - additional information: customer's wishes for the product, it's packaging or delivery.;
     */

    int orderNum;
    int quantityOrder;
    boolean testNeed;
    double orderSum;
    String courierName;
    String deliveryType;
    String deliveryAddress;
    String addInfo;
}
