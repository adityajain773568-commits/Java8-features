package com.aditya.DateTimeAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat simpleDateFormatIND = new SimpleDateFormat("dd/MM/yyyy");
        String INDFormat = simpleDateFormatIND.format(date);
        System.out.println(INDFormat);

        SimpleDateFormat simpleDateFormatUS = new SimpleDateFormat("MM/dd/yyyy");
        String USFormat = simpleDateFormatUS.format(date);
        System.out.println(USFormat);

//        Convert String to Date
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate = sdf3.parse(USFormat);
        




    }
}
