package com.example.acme.csci3130_demo;

public class Validator {

    public static int validation(String pw) {
        int rules = 0;
        //it is not “password” (case insensitive)
        if (!pw.equalsIgnoreCase("PASSWORD")) {// equalsIgnoreCase method will return true
            rules++;
        }
        //it is at least 8 characters long
        if (!(pw.length() < 8)) {
            rules++;
        }
        return rules;
    }
}
