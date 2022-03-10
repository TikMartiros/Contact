package com.example.demo.util;

import com.example.demo.model.util.Label;

import java.util.regex.Pattern;

public final class  Validator {
    public static  boolean checkLength(final String value, final int length){
        return value.length()==length;
    }

    public static  boolean checkLable(final Label value, Label[] lable ){ //[WORK, HOME, PERSONAL]
        for (int i = 0; i < lable.length; i++) {
            if (lable[i] == value) return true;
        }
        return false;
    }

    public static boolean checkEmail(final String email, String regExp){
        return Pattern.compile(regExp).matcher(email).matches();
    }
    public static boolean checkPhone(final String phone, String regExp){
        return Pattern.compile(regExp).matcher(phone).matches();
    }

}
