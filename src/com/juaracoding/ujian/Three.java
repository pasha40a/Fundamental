package com.juaracoding.ujian;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // isi disini
        int angka = scan.nextInt();

        if(angka % 2==0){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }


    }
}
