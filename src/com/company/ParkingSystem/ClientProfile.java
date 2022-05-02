package com.company.ParkingSystem;

public class ClientProfile {

    /**
     * This class defines information about clients;
     * @clientIdentifier - client's identification number in the company's CRM system;
     * @name - client's full name;
     * @carBrand - full brand name of the client's car;
     * @carModel - full model name of the client's car;
     * @carNum - registration number of the client's car;
     * @carAlarm - the presence of an alarm in the client's car;
     * @carInsure - availability of car's insurance;
     * @adress - client's exact address;
     * @mobileNum - client's mobile phone number;
     */

    int clientIdentifier;
    String name;
    String carBrand;
    String carModel;
    int carNum;
    boolean carAlarm;
    boolean carInsure;
    String address;
    int mobileNum;
}
