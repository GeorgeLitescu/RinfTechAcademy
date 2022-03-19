package com.company;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class TestingZone {
    public static void main(String[] args) {
        final LocalDate myBirthday = LocalDate.of(2001, Month.APRIL, 29);
        final LocalTime endOfWork = LocalTime.of(17, 30);
        final LocalDateTime currentTime = LocalDateTime.now();
        final List<LocalDate> friday13ths = new ArrayList<>(allFriday13th(myBirthday, currentTime.toLocalDate()));
        Flight zurichToSF = new Flight();

        System.out.println("I was born on " + myBirthday);
        System.out.println("Work ends at " + endOfWork);
        System.out.println("The current time is " + currentTime);

        System.out.println("2020 is a leap year: " + isLeap(2020));

        System.out.println(untilNextBirthday(currentTime.toLocalDate(), myBirthday) + " until Birthday");
        System.out.println(sinceLastBirthday(currentTime.toLocalDate(), myBirthday) + " since Birthday");

        System.out.println("Here is a list of all friday 13ths since my birthday and today: ");
        for (int i = 0; i < friday13ths.size(); i++)
            System.out.println(friday13ths.get(i));

        System.out.println("Time of departure in San Francisco is: " + zurichToSF.getTod("San Francisco"));
        System.out.println("Time of arrival in San Francisco is " + zurichToSF.getToa("San Francisco"));
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0;
    }

    public static Period untilNextBirthday(LocalDate present, LocalDate bday) {
        bday = bday.withYear(present.getYear());
        if (bday.isBefore(present))
            bday = bday.plusYears(1);
        return Period.between(present, bday);
    }

    public static Period sinceLastBirthday(LocalDate present, LocalDate bday) {
        //return  Period.ofYears(1).minus(untilNextBirthday(present, bday));
        //for some unknown reason it does not work so i will copy code from untilNextBirthday
        bday = bday.withYear(present.getYear());
        if (bday.isAfter(present))
            bday = bday.minusYears(1);
        return Period.between(bday, present);
    }

    public static List<LocalDate> allFriday13th(LocalDate start, LocalDate end) {
        List<LocalDate> dates = new ArrayList<>();
        int i = 0;

        if (start.isBefore(start.withDayOfMonth(13)))
            start.equals(start.withDayOfMonth(13));
        else start.equals(start.withDayOfMonth(13).plusMonths(1));

        for (LocalDate var = start; var.isBefore(end) || var.equals(end); var = var.plusMonths(1)) {
            if (var.getDayOfWeek() == DayOfWeek.FRIDAY) {
                dates.add(i, var);
                i++;
            }
        }

        return dates;
    }
}

