package com.juaracoding.dayfour;

public class ContohFor {
    public static void main(String[] args) {
        // ***
        // ***
        // ***
        // outer
        int sisi = 5;
        for (int i=0;i<sisi;i++){
            // inner
            for (int j=0;j<sisi;j++){ // ***
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---");
        // *
        // **
        // ***
        // outer
        for (int i=0;i<sisi;i++){
            // inner
            for (int j=0;j<i+1;j++){ // *
                System.out.print("*");
            }
            System.out.println();
        }
        // 1
        // 1 2
        // 1 2 3
        System.out.println("---");
        // outer
        for (int i=0;i<sisi;i++){
            // inner
            for (int j=0;j<i+1;j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
        // 1
        // 1 *
        // 1 * 3
        // 1 * 3 *
        System.out.println();
        // outer
        for (int i=0;i<sisi;i++){
            // inner
            for (int j=1;j<i+1;j++){
                if(j % 2 == 1){
                    System.out.print(j);
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
