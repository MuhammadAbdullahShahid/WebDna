package com.example.webDna.util.dateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {



    public static Date strToDate(String dateStr, String pattern) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    public static Date getDate(String dateStr, String format) {
        Date date = null;
        try {
            date= new SimpleDateFormat(format).parse(dateStr);
        } catch (Exception e) {

        }
        return date;
    }


    public static String dateToStr(Date date) {
        String dateStr = "";
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            dateStr = sdf.format(date);
        }
        return dateStr;

    }

    public static String dateToStr(Date date, String format) {
        String dateStr = "";
        if (date != null) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            dateStr = sdf.format(date);
        }
        return dateStr;
    }

}
