package com.juaracoding.ujian;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        String profesi = scan.nextLine();
        int salary = scan.nextInt();

        // Lengkapi
        karyawan(nama,profesi,salary);
    }

    static void karyawan(String nama,String profesi, int salary) {
        // Lengkap
        System.out.println("Nama: "+nama.toUpperCase());
        System.out.println("Profesi: "+profesi.toUpperCase());
        System.out.println("Salary: "+salary);

    }
}

