package com.blz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    public static void main(String[] args) {
        String email = "abc@bridgelabz.co";
        String regex = "^[a-z0-9]+@[a-z]+.[a-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);//Java class
        Matcher matcher = pattern.matcher(email);// Java class
        if (matcher.matches())
            System.out.println("Email is Valid");
        else
            System.out.println("Email is Invalid");
    }
}

