package com.dk.java.basics;

public class IfElse {
    public void ifElseExample() {

        int x = 8;
        // System.out.println("Hello");
        // System.out.println("Bye");

        // int x=18;
        // if(x>10) {
        // System.out.println("Hello");
        // }

        // if(true) {
        // System.out.println("Hello");
        // }

        // int x=28;
        // if(x>10 && x<=20) { //11-20
        // System.out.println("Hello");
        // }
        // System.out.println("Bye");

        // int x=28;
        // if(x>10 && x<=20) { //11-20
        // System.out.println("Hello");
        // }
        // else
        // System.out.println("Bye");

        int x1 = 8;
        int y = 7;
        if (x1 > y) {
            System.out.println(x1);
            System.out.println("Thankyou");
        } else
            System.out.println(y);

        // int x=8;
        // int y=7;
        // int z=8;
        //
        // if(x>y && x>z) //false
        // {
        // System.out.println(x);
        // }
        // else
        // System.out.println(y);

        // int x=8;
        // int y=7;
        // int z=9;
        // if(x>y && x>z) //false
        // System.out.println(x);
        // else if(y>x && y>z)
        // System.out.println(y);
        // else
        // System.out.println(z);

        int x2 = 8;
        int y1 = 7;
        int z = 9;
        if (x2 > y1 && x > z) // false
            System.out.println(x2);
        else if (y1 > z)
            System.out.println(y1);
        else
            System.out.println(z);
    }
}
