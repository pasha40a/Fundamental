package com.juaracoding.dayfive.bidang;

public class Segitiga {

   public  void draw(int sisi) {//Prosedur
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
