package reader;

import entity.Flight;
import entity.Plane;
import exaption.EmtySourceFile;
import util.flightUtil;
import util.planeUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDataFileReader {
    private String filepath;

    public FlightDataFileReader(String filepath) {
        this.filepath = filepath;
    }
    public List<Flight> read(){
        List<Flight> flights = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            checkFile();
            String line;
            while ((line = reader.readLine())!=null){
                Flight flight = flightUtil.toObject(line);
                flights.add(flight);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (EmtySourceFile emtySourceFile) {
            emtySourceFile.printStackTrace();
        }
        return flights;
    }
    private  void checkFile() throws EmtySourceFile {
        File sourceFile = new File(filepath);
        if (sourceFile.length()==0){
            throw  new EmtySourceFile("Файл Пуст");
        }
    }
}

