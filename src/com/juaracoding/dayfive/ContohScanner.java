package com.juaracoding.dayfive;

import java.util.Scanner;

public class ContohScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        int age = scan.nextInt();
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+age);
    }
}
