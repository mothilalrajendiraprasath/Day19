package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userValidate {
    public static Pattern p ;
    public static Matcher m;

    public void validateName(String flname){
        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2}\s[A-Z]{1}[a-z]{2}$");
        Matcher m = p.matcher(flname);
        boolean b= m.matches();
        if(b==false){
            System.out.println("name must start with capital and should not exceed more than 3 letter");
        }
    }

    public void validateMail(String mail){
        Pattern p = Pattern.compile("^[A-za-z.]+[A-za-z.]+@[a-z]{2}+.[a-z]{2}");
        Matcher m = p.matcher(mail);
        boolean b= m.matches();
        if(b==false){
            System.out.println("Check the mail");
        }
    }

    public void validateNum(String num){
        Pattern p = Pattern.compile("^[0-9]{2}[0-9]{10}$");
        Matcher m = p.matcher(num);
        boolean b= m.matches();
        if(b==false){
            System.out.println("phone number should be within 10 digit");
        }
    }

    public void validatePassword(String word){
        Pattern p = Pattern.compile("^(?=.*[A-Z])+[A-za-z]{8}");
        Matcher m = p.matcher(word);
        boolean b= m.matches();
        if(b==false){
            System.out.println("Enter the right password");
        }
    }
}
