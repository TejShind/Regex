package com.blz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    public static void main(String[] args) {
        String email = "abc.xyz@bridgelabz.co.in";
        String regex = "^[a-z0-9]+([.+_-][a-z]+)*@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);//Java class
        Matcher matcher = pattern.matcher(email);// Java class
        if (matcher.matches())
            System.out.println("Email is valid. \nAs optional part xyz and country code matches with regex pattern");
        else
            System.out.println("Email is Invalid. \nAs optional part xyz and country code doesn't matches with regex pattern");
    }
}

