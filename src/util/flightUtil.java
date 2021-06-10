package util;
import entity.Flight;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class flightUtil {

    public static Flight toObject(String line) {
        String[] flightArr = line.split(";");
        int id = Integer.parseInt(flightArr[0]);
        int plane_id = Integer.parseInt(flightArr[1]);
        int pilot_id = Integer.parseInt(flightArr[2]);
        Date data = StrToDate(flightArr[3]);
//         time = StrToTime(flightArr[4]);

        String time = flightArr[4];
        String number_flight = flightArr[5];
        return new Flight(id, plane_id, pilot_id, data, time, number_flight);
    }
private static Date StrToDate(String stringDate){
    DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    Date nDate1 = new Date();
    try{
        Date nDate2 = date.parse(stringDate);
        date.format(nDate2);
    }
     catch(Exception e){
        System.out.println(e);
    }

    return nDate1;
}
//    private static Date StrToDate(String s) {
//        SimpleDateFormat format = new SimpleDateFormat();
//        format.applyPattern("yyyy.MM.dd");
//        Date doc = new Date();
//        try {
//            Date docDate= format.parse(s);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
////        Date date = new Date();
////        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
////        ft.format(date);
////        try{
////
////        }
////        catch (Exception e) {
////            e.printStackTrace();
////        }
//       return doc;
//
//    }


//    public static Date StrToDate(String strDate) {
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");
//        Date date= new Date();
//        try {
//            Date parsingDate1 = ft.parse(strDate);
//
//        }catch (ParseException e) {
//            System.out.println("Нераспаршена с помощью " + ft);
//        }
//
//        return par;
//    }




    }












