package com.dk.java.staticExample;

public class StaticVariableCode {
    public void staticVariableExample() {
        Mobile1 obj1 = new Mobile1();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // obj1.name="SmartPhone";
        Mobile1.name = "SmartPhone";

        Mobile1 obj2 = new Mobile1();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // obj2.name="SmartPhone";
        Mobile1.name = "SmartPhone";

        // obj1.name="Phone";
        Mobile1.name = "SmartPhone";

        obj1.show();
        obj2.show();

        // System.out.println(obj1.brand);
    }
}

class Mobile1 {
    String brand;
    int price;
    String network;
    // String name;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}