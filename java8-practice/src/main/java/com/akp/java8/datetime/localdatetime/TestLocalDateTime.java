package com.akp.java8.datetime.localdatetime;

import java.time.LocalDateTime;

public class TestLocalDateTime {

    public LocalDateTime getLocalDateTimeUsingParseMethod(String representation) {
        return LocalDateTime.parse(representation);
    }

}
