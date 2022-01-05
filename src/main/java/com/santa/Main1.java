package com.santa;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main1 {
    public static void main(String[] args) {
//        int intDate = 22;

String date = new SimpleDateFormat("k").format(new Date());
int intDate = Integer.parseInt(date);
        System.out.println("date = " + date);

        if (intDate < 6 || intDate >= 22) {
            System.out.println("noch");
        }
        if (intDate >= 6 && intDate < 11) {
            System.out.println("utro");
        }
        if (intDate >= 11 && intDate < 17) {
            System.out.println("den");
        }
        if (intDate >= 17 && intDate < 22) {
            System.out.println("vecher");
        }

    }
}
