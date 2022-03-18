package com.company;

import java.time.*;

public class Flight {
    private final LocalDateTime tod = LocalDateTime.of(2019, 9, 15, 13, 10); //time of departure
    private final LocalDateTime toa = tod.plusHours(11).plusMinutes(50); //time of arrival

    ZoneId zoneZurich = ZoneId.of("Europe/Zurich");
    ZoneId zoneSanFran = ZoneId.of("US/Pacific");

    public ZonedDateTime getTod(String zone) {
        if (zone.equals("Zurich"))
            return tod.atZone(zoneZurich);
        else if (zone.equals("San Francisco"))
            return tod.atZone(zoneSanFran);

        throw new RuntimeException("Where is that?");
    }

    public ZonedDateTime getToa(String zone) {
        if (zone.equals("Zurich"))
            return toa.atZone(zoneZurich);
        else if (zone.equals("San Francisco"))
            return toa.atZone(zoneSanFran);

        throw new RuntimeException("Where is that?");
    }

}
