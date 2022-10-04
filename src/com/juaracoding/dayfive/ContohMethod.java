package com.juaracoding.dayfive;

import com.juaracoding.dayfive.bidang.Calculator;
import com.juaracoding.dayfive.bidang.Segitiga;

public class ContohMethod {
    public static void main(String[] args) {
        persegi(5);
        persegi(7);
        //instance object
        Segitiga segitiga = new Segitiga();
        segitiga.draw(5);
        Persegi kotak = new Persegi();
        kotak.persegi(5);

        Calculator calculator = new Calculator();
        int hasil = calculator.add(10,5);
        System.out.println(hasil);
        System.out.println(calculator.add(200,150));
    }

    static void persegi(int sisi){
        for(int i=0; i< sisi; i++){
            for (int j=0; j<sisi; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
