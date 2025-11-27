package com.dk.java.stringSamples;

public class ImmutableString {
    
    public void mutableAndImmutableExample(){
        String name="navin";
		name=name+"reddy";
		System.out.println("hello"+name);
		
		String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2);	
    }
    
}
