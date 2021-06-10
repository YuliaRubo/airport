package util;

import entity.Pilot;
import entity.Rank;

public class pilotUtil {
    public static Pilot toObject (String line) {
        String[] pilotArr = line.split(";");
        int id = Integer.parseInt(pilotArr[0]);
        String firstname = pilotArr[1];
        String lastname = pilotArr[2];
        String rank = pilotArr[3];
        String code = pilotArr[4];
return new Pilot(id, firstname, lastname, rank, code);
    }
}
