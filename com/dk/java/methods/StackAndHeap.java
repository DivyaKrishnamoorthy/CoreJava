package com.dk.java.methods;

public class StackAndHeap {
    public void stackAndHeapExample() {
        int data = 10;
        CalculatorHeap obj = new CalculatorHeap();
        CalculatorHeap obj1 = new CalculatorHeap();
        int r1 = obj.add(3, 4);
        // System.out.println(r1);
        obj.num = 8;

        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}

class CalculatorHeap {
    int num = 5;

    public int add(int n1, int n2) {
        System.out.println(num);
        return n1 + n2;
    }
}