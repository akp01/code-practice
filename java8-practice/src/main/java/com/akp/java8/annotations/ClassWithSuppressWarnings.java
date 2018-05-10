package com.akp.java8.annotations;

class ClassWithSuppressWarnings {

    @SuppressWarnings("deprecation")
    void useDeprecatedMethod() {
        ClassWithDeprecatedMethod.deprecatedMethod(); // no warning is generated here
    }
}
