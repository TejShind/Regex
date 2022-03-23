package com.blz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    public static void main(String[] args) {
        String pinCode = "400088X";
        String regex = "^[1-9]{1}[0-9]{5}$";

        Pattern pattern = Pattern.compile(regex);//Java class
        Matcher matcher = pattern.matcher(pinCode);// Java class
        if (matcher.matches())
            System.out.println("PinCode is Valid");
        else
            System.out.println("PinCode is Invalid because there is alphabet at End");
    }
}



