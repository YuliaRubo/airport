package com.company;

import entity.Flight;
import reader.FlightDataFileReader;
import reader.PilotDataFileReader;
import reader.PlaneDataFileReader;

public class Main {

    public static void main(String[] args) {
//        PilotDataFileReader dataFileReader = new PilotDataFileReader("data\\pilot.csv");
//        System.out.println(dataFileReader.read());
//        PlaneDataFileReader dataPlaneFileReader = new PlaneDataFileReader("data\\plane.csv");
//        System.out.println(dataPlaneFileReader.read());

        FlightDataFileReader dataFlightFileReader = new FlightDataFileReader("data\\flight.csv");
        System.out.println(dataFlightFileReader.read());

    }

}
