package entity;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Flight {
    private int id;
    private int plane_id;
    private int pilot_id;
    private Date data;
    private String time;
    private String number_flight;

    public Flight(int id, int plane_id, int pilot_id, Date data, String time, String number_flight) {
        this.id = id;
        this.plane_id = plane_id;
        this.pilot_id = pilot_id;
        this.data = this.data;
        this.time = time;
        this.number_flight = number_flight;
    }




    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", plane_id=" + plane_id +
                ", pilot_id=" + pilot_id +
                ", data='" + data + '\'' +
                ", time='" + time + '\'' +
                ", number_flight='" + number_flight + '\'' +
                '}'+'\n';
    }
}
