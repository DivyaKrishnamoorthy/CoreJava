package com.dk.java.staticExample;

public class StaticBlockCode {

    public void staticBlockExample() {
        Student sb = new Student();
        Student sb2 = new Student();
       // Class.forName("Student");
    }
}

class Student {
    int marks;
    String name;
    static String school;

    static {
        school = "HFCMSS";
        System.out.println("inside static block");
    }

    public Student(){
        name = "Divya";
        marks = 100;
        System.out.println("Inside constructor");
    }

}