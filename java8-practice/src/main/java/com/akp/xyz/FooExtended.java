package com.akp.xyz;


@FunctionalInterface
public interface FooExtended extends Baz, Bar {

    @Override
    default String defaultMethod() {
        return Bar.super.defaultMethod();
    }

}
