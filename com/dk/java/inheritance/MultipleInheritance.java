package com.dk.java.inheritance;

public class MultipleInheritance {
    public void multipleInheritance() {

    }
}

class A {

}

class B extends A {

}

// class C extends A,B
// Multiple inheritance does not supported by Java
// Ambiguity issue
class C extends B {

}