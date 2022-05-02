package com.company.TruckingSystem;

public class ClientProfile {

    /**
     * This class defines information about counterparty;
     * @clientIdentifier - counterpartie's identification number in the company's CRM system;
     * @name - counterpartie's full name;
     * @clientRegNum - counterpartie's registration number;
     * @kindOfActivity - type of activity of the counterparty;
     * @address - counterpartie's exact address;
     * @phoneNum - counterpartie's phone number;
     * @numberOfContract - number of the contract with the counterparty;
     * @dateOfContract - date of the contract with the counterparty;
     * @dealAmount - the amount of the deal (contract) - ($);
     */

    int clientIdentifier;
    String name;
    int clientRegNum;
    String kindOfActivity;
    String address;
    int phoneNum;
    int numberOfContract;
    String dateOfContract;
    double dealAmount;
}
