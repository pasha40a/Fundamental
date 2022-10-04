package com.juaracoding.dayfive;


class Calculation{
    int hasil;
    void perkalian(int a, int b){
        hasil = a*b;
        System.out.println(hasil);
    }
}

public class ContohInherit extends Calculation {
            void pengurangan(int a, int b){
                hasil = a - b;
                System.out.println(hasil);
            }

    public static void main(String[] args) {
                ContohInherit contohInherit = new ContohInherit();
                contohInherit.perkalian(5,2);
                contohInherit.pengurangan(5,2);

    }
}
