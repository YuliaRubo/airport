package com.company;

import com.company.db.writer.pilotDbWriter;
import com.company.entity.Pilot;
import com.company.reader.FlightDataFileReader;
import com.company.reader.PilotDataFileReader;
import com.company.reader.PlaneDataFileReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        PilotDataFileReader dataFileReader = new PilotDataFileReader("data\\pilot.csv");
        List<Pilot> pilots = dataFileReader.read();

        pilotDbWriter.insert(pilots);
//        System.out.println(dataFileReader.read());
//        PlaneDataFileReader dataPlaneFileReader = new PlaneDataFileReader("data\\plane.csv");
//        System.out.println(dataPlaneFileReader.read());

//        FlightDataFileReader dataFlightFileReader = new FlightDataFileReader("data\\flight.csv");
//        System.out.println(dataFlightFileReader.read());

    }

}
