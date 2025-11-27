package com.dk.java.arrays;

public class JaggedArray {

    public void jaggedArrayExample() {
        // int nums[][]=new int [3][]; //jagged
        // nums[0]=new int [3];
        // nums[1]=new int [4];
        // nums[2]=new int [2];

        int num1[][] = new int[3][];
        num1[0] = new int[3];
        num1[1] = new int[5];
        num1[2] = new int[2];

        for(int i=0; i<num1.length; i++){
            for(int j=0; j<num1[i].length; j++){
                num1[i][j] = (int)(Math.random()*100);
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }

        int nums[][] = new int[3][4];
        // int nums[][]=new int [3][4][5]; // three dimensional

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
    }

}
