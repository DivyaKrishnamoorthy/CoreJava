package com.dk.java.encapsulation;

class Human3 {
    // int age;
    // private int age=11;
    private int age;
    // String name;
    // private String name="Navin";
    private String name;

    public int getAge() {
        return age;
    }

    public void SetAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class EncapsulationExample {

    public void encapsulationExample() {
        Human3 obj = new Human3();
        obj.SetAge(30);
        obj.setName("Reddy");
        // obj.age=11;
        // obj.name="Navin";

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
