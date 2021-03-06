package com.intellisense.BusReservationSystem.dto;

public class TripSheduleDto {
    /*
    DTOs are not meant to be the mirror image of their
    model counterparts, rather they should be a reflection of what the user
    interface or the api response demands
     */
    private String id;
    private String tripId;
    private String tripDate;
    private int availableSeats;
    private int fare;
    private int journeyTime;
    private String busCode;
    private String sourceStop;
    private String destinationStop;
}
