package com.akp.xyz;


@FunctionalInterface
public interface Foo {

    String method(String string);

    default void defaultMethod() {
    }
}
