package com.dk.java.inheritance;

public class ThisAndSuperKeyword {
    public void thisAndSuperKeyword() {
        B1 obj = new B1();
        // System.out.println(obj.num);
        System.out.println(obj.getValue());
    }
}

class A1 extends Object {
    int num = 1;
}

class B1 extends A1 {
    int num = 2;

    public int getValue() {
        int num = 3;
        // return this.num;
        return super.num;
    }
}