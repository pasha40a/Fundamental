package com.juaracoding.ujian;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        String nim = scan.nextLine();
        //Lengkapi
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.tampilkan(nama,nim);

    }

}
class Mahasiswa extends Ten {
    void tampilkan(String nama, String nim){
        System.out.println("Nama: "+ nama.toUpperCase());
        System.out.println("Nim: "+ nim);
        System.out.println("Tahun Masuk: "+ nim.substring(0,4));

    }

}
