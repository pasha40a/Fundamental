package com.juaracoding.ujian;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int urut1 = scan.nextInt();
        int urut2 = scan.nextInt();
        Angka1(urut1);
        Angka2(urut2);
    }

    static void Angka1(int urut1) {
        int i = 0;
        do {
            if (i%2==0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= urut1);
        System.out.print("\n");
    }

    static void Angka2(int urut2) {
        do {
            if (urut2%4==0) {
                System.out.print(urut2 + " ");
            }
            urut2--;
        } while (urut2 >= 0);
    }

    }


