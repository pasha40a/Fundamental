package com.juaracoding.ujian;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int awal = scan.nextInt();
        int akhir = scan.nextInt();
        int deret = scan.nextInt();



        System.out.println("Deret aritmatika");
        int i=awal;
        while (i<akhir){
            System.out.print(i+" ");
                i=i+deret;
            }
        }
    }

