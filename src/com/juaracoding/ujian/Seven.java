package com.juaracoding.ujian;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {



    Computer computer = new Computer();
    // complete the code
		computer.displaySpec();
    }
}

class Computer extends Seven {
    int ram;
    String gpu;
    String harddisk;
    String motherboard;
    String processor;
    // complete the code


    void displaySpec(){
        Scanner scan = new Scanner(System.in);
        String processor = scan.nextLine();
        String motherboard = scan.nextLine();
        int ram = scan.nextInt();
        int slot = scan.nextInt();
        String gpu = scan.next();
        String harddisk = scan.next();
        System.out.println("Processor: "+ processor+", "+"Motherboard: "+motherboard+", "+"RAM: "+ram+"x"+slot+", ");
        System.out.println("GPU"+gpu+", "+"Harddisk: "+harddisk);


    }
}
