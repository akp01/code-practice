package com.akp.jcp.the.java.memory.model;

import net.jcip.annotations.*;

/**
 * DoubleCheckedLocking
 * <p/>
 * Double-checked-locking antipattern
 *
 * 
 */
@NotThreadSafe
public class DoubleCheckedLocking {
    private static Resource resource;

    public static Resource getInstance() {
        if (resource == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (resource == null)
                    resource = new Resource();
            }
        }
        return resource;
    }

    static class Resource {

    }
}
