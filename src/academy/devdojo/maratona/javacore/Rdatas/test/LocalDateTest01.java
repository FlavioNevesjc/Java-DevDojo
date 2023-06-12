package academy.devdojo.maratona.javacore.Rdatas.test;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

import static java.time.LocalTime.now;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.now();
        System.out.println(date.getMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date);
        System.out.println(now(Clock.systemDefaultZone()));


    }
}
