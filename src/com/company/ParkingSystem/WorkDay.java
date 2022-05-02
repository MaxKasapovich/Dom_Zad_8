package com.company.ParkingSystem;

public class WorkDay {

    /**
     * This class defines information about 1 working day of the parking lot;
     * @occupiedSpaces - number of occupied parking spaces during the day;
     * @freeSpaces - number of empty parking spaces during the day;
     * @unavailableSpaces - the number of parking spaces that cannot be used due to technical reasons;
     * @revenuePerDay - total car parking revenue at the end of the day ($);
     * @alarmNum - number of alarm triggerings during the day;
     * @incident - incidence occurrence (the occurrence of fires, calling the police, self-detention of violators, etc.);
     * @clientsNew - the number of new registered clients during the day;
     */

    int occupiedSpaces;
    int freeSpaces;
    int unavailableSpaces;
    double revenuePerDay;
    int alarmNum;
    boolean incident;
    int clientsNew;
}
