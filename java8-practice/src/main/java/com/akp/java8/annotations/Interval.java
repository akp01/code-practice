package com.akp.java8.annotations;

import java.lang.annotation.Repeatable;

@Repeatable(Intervals.class)
@interface Interval {
    int hour() default 1;
}
