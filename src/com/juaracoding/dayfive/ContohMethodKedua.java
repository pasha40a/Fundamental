package com.juaracoding.dayfive;

import com.juaracoding.dayfive.bidang.Genap;

public class ContohMethodKedua {
    public static void main(String[] args) {
        String nama = "Objek Kedua";
        Genap genap = new Genap();
        genap.genap(1,11);
        System.out.printf("\n");
        System.out.printf("%s\n", nama);
        genap.genap(11,21);
    }
}
