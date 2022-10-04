package com.juaracoding.ujian;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // isi disini
        int awal = scan.nextInt();
        int akhir = scan.nextInt();

        for(int i=awal; i<akhir; i++){
            if (i%3==0){
                int hasil = awal*i;
                System.out.println(awal+" x "+i+" = "+hasil );
            }

        }

    }
}
