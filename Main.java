package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("REGEX USER VALIDATION");
        Scanner sc= new Scanner(System.in);
	com.company.userValidate validate = new com.company.userValidate();
    System.out.println("Enter the first and last name:");
    String flname = sc.nextLine();
    validate.validateName(flname);
        System.out.println("Enter the mail");
        String mail= sc.nextLine();
        validate.validateMail(mail);
        System.out.println("Enter the phone number");
        String num= sc.nextLine();
        validate.validateNum(num);
    }
}
