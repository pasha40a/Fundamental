package com.juaracoding.ujian;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // isi disini
        int tgl = scan.nextInt();
        int plat = scan.nextInt();

        if (tgl%2==0){
            System.out.print("Tanggal genap dan");
        }else {
            System.out.print("Tanggal ganjil dan");
        }
        if (plat%2==0){
            System.out.print(" plat nomor genap");
        }else {
            System.out.print(" plat nomor ganjil");
        }
    }
}
