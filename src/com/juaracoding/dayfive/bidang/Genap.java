package com.juaracoding.dayfive.bidang;

public class Genap {
    public void genap(int awal, int akhir) {
        for (int i = awal; i < akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}

