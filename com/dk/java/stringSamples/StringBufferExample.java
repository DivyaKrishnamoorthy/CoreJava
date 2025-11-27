package com.dk.java.stringSamples;

public class StringBufferExample {

    public void stringBufferExample() {
        StringBuffer sb = new StringBuffer("Navin");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        sb.append("Reddy");
        System.out.println(sb);

        // String str=sb.toString();

        // sb.deleteCharAt(2);
        // sb.insert(0,"Java");
        // sb.insert(6,"java");
        // sb.setLength(30);
        sb.ensureCapacity(100);
        
        System.out.println(sb);
        System.out.println("Capacity: " +sb.capacity());

    }

}
