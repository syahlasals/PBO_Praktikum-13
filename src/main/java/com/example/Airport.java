package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Airport {

    private static final Logger LOGGER = Logger.getLogger(Airport.class.getName());

    public static void main(String[] args) {
        Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BusinessFlight("2");
        Passenger james = new Passenger("James", true);
        Passenger mike = new Passenger("Mike", false);
        businessFlight.addPassenger(james);
        businessFlight.removePassenger(james);
        businessFlight.addPassenger(mike);
        economyFlight.addPassenger(mike);
        LOGGER.info("Business flight passengers list:");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            LOGGER.log(Level.INFO, passenger.getName());
        }
        LOGGER.info("Economy flight passengers list:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            LOGGER.log(Level.INFO, passenger.getName());
        }
    }
}