package com.akp.xyz.doublecolon.function;

import com.akp.xyz.doublecolon.Computer;

@FunctionalInterface
public interface ComputerPredicate {

    boolean filter(Computer c);

}
