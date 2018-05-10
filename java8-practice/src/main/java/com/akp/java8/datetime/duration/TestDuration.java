package com.akp.java8.datetime.duration;

import java.time.Duration;
import java.time.LocalTime;

public class TestDuration {

    public LocalTime modifyDates(LocalTime localTime, Duration duration) {
        return localTime.plus(duration);
    }

    public Duration getDifferenceBetweenDates(LocalTime localTime1, LocalTime localTime2) {
        return Duration.between(localTime1, localTime2);
    }
}
