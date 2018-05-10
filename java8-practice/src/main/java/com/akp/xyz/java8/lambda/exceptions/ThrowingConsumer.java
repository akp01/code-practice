package com.akp.xyz.java8.lambda.exceptions;

@FunctionalInterface
public interface ThrowingConsumer<T, E extends Exception> {

    void accept(T t) throws E;

}