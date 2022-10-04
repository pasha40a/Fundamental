package com.juaracoding.dayfive;

import com.juaracoding.dayfive.model.User;

public class ContohEncapsulation {

    public static void main(String[] args) {
        User dadang = new User();
        dadang.setUsername("Addham");
        dadang.setPassword("dham");
        System.out.println(dadang.getUsername());
        System.out.println(dadang.getPassword());

    }
}
