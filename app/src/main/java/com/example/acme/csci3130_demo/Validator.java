package com.example.acme.csci3130_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        //requiring at least 1 special character
        String reg1 ="[*.!@#$%^&(){}\\[]\\:;<>,.?/~_+-=|\\]";
        Pattern pattern1 = Pattern.compile(reg1);
        Matcher matcher1 = pattern1.matcher(pw);
        if(matcher1.find()==true){
            rules++;
        }
        String reg2 ="[0-9]";
        Pattern pattern2 = Pattern.compile(reg2);
        Matcher matcher2 = pattern2.matcher(pw);
        //at least 1 digit
        if(matcher2.find()==true){
            rules++;
        }
        String reg3 ="[a-zA-Z]";
        Pattern pattern3 = Pattern.compile(reg2);
        Matcher matcher3 = pattern3.matcher(pw);
        //both upper and lower case
        if(matcher3.find()==true){
            rules++;
        }
        return rules;
    }
}
