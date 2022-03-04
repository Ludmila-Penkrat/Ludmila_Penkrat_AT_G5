package tasks.homework.stringTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormat {
    public static void main(String[] args) throws ParseException{

        String oldData = "22.00 07.09.2020";

        SimpleDateFormat oldFormat = new SimpleDateFormat("HH.mm dd.MM.yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("MMMM, d, yyyy HH:mm", Locale.ENGLISH);
        Date date = oldFormat.parse(oldData);
        String result = newFormat.format(date);
        System.out.println(result);


    }




}
