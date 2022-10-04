package com.juaracoding.ujian;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0; i<5; i++)
        {
            array[i]=scan.nextInt();
        }
        System.out.print(array[3]);
    }
}
