package com.juaracoding.ujian;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // isi disini
        String day = scan.nextLine();
        switch (day){
            case "Weekday":
                System.out.println("Senin Selasa Rabu Kamis Jum'at");
                break;
            case "Weekend":
                System.out.println("Sabtu Minggu");
                break;
            default:
                System.out.println("Invalid input");
        }

    }

}
