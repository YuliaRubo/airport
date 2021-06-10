package util;

import entity.Pilot;
import entity.Plane;

public class planeUtil {
    public static Plane toObject (String line) {
        String[] planeArr = line.split(";");
        int id = Integer.parseInt(planeArr[0]);
        String brand = planeArr[1];
        String model = planeArr[2];
        int number_Passenger = Integer.parseInt(planeArr[3]);
        int number = Integer.parseInt(planeArr[4]);
        return new Plane(id,brand,model,number_Passenger,number);
    }
}

