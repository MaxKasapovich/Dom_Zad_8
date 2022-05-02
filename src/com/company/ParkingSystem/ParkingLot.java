package com.company.ParkingSystem;

public class ParkingLot {

    /**
     * This class defines information about parking lot;
     * @parkSpaces - total number of parking spaces in the parking lot;
     * @watchmanName - full name of the watchman, who is on shift;
     * @priceDay - price for one parking day ($);
     * @blockedBarrier1 - status of the barrier № 1 blocking;
     * @blockedBarrier2 - status of the barrier № 2 blocking;
     * @alarmSystem - alarm operation status (On\Off);
     * @lotAddress - the exact address of the parking lot;
     * @lotLength - parking lot length (feet);
     * @lotWidth - parking lot width (feet);
     */

    int parkSpaces;
    String watchmanName;
    double priceDay;
    boolean blockedBarrier1;
    boolean blockedBarrier2;
    boolean alarmSystem;
    String lotAddress;
    double lotLength;
    double lotWidth;

}
