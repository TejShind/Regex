package com.blz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    public static void main(String[] args) {
        String pinCode = "400088";
        String regex = "^[0-9]{6}$";

        Pattern pattern = Pattern.compile(regex);//Java class
        Matcher matcher = pattern.matcher(pinCode);// Java class
        if (matcher.matches())
            System.out.println("PinCode is Valid");
        else
            System.out.println("PinCode is Invalid ");
    }
}



