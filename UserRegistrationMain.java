package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationMain {
    public static void userDataValidation(){
        Scanner sc = new Scanner(System.in);
        String fName = null, lName = null, emailId = null, mobileNumber = null, password = null;

        int temp = -1;
        while(temp != 0) {
            System.out.println("1.FirstName 2.LastName 3.EmailID 4.MobileNumber 5.Password 7.Exit");
            System.out.print("Enter the option:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean flagFname = false;
                    while (flagFname != true) {
                        System.out.print("Enter first name:");
                        fName = sc.next();
                        if (firstNameValidation(fName)) {
                            flagFname = true;
                            System.out.println("first name valid");
                        } else {
                            System.out.println("!first name not valid!");
                        }
                    }
                    break;
                case 2:
                    boolean flagLname = false;
                    while (flagLname != true) {
                        System.out.print("Enter last name:");
                        lName = sc.next();
                        if (lastNameValidation(lName)) {
                            flagLname = true;
                            System.out.println("last name valid");
                        } else {
                            System.out.println("!last name not valid!");
                        }
                    }
                    break;
                case 3:
                    boolean flagEmail = false;
                    while (flagEmail != true) {
                        System.out.print("Enter email Id:");
                        emailId = sc.next();
                        if (emailIdValidation(emailId)) {
                            flagEmail = true;
                            System.out.println("emailID valid");
                        } else {
                            System.out.println("!emailID not valid!");
                        }
                    }
                    break;
                case 4:
                    boolean flagMobile = false;
                    while (flagMobile != true) {
                        System.out.print("Enter mobile number:");
                        mobileNumber = sc.next();
                        if (mobileNumberValidation(mobileNumber)) {
                            flagMobile = true;
                            System.out.println("mobile number valid");
                        } else {
                            System.out.println("!mobile number not valid!");
                        }
                    }
                    break;
                case 5:
                    boolean flagPassword = false;
                    while (flagPassword != true) {
                        System.out.print("Enter password:");
                        password = sc.next();
                        if (passwordValidation(password)) {
                            flagPassword = true;
                            System.out.println("password valid");
                        } else {
                            System.out.println("!password not valid!");
                        }
                    }
                    break;
                case 7:
                    temp = 0;
                    break;
                default:
                    System.out.println("!!! Enter valid option !!!");
                    break;
            }
        }
    }

    public static boolean firstNameValidation(String value){
        Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(value);
        return (matcher.matches());
    }
    public static boolean lastNameValidation(String value){
        Pattern pattern = Pattern.compile("^[A-Z]{1,1}[a-z]{2,}$");
        Matcher matcher = pattern.matcher(value);
        return (matcher.matches());
    }
    public static boolean emailIdValidation(String value){
        Pattern pattern = Pattern.compile("^[a-z0-9]+[_/+-.]*[0-9a-z]*@[a-z0-9]+.[a-z]{2,6}.[a-z]*$");
        Matcher matcher = pattern.matcher(value);
        return (matcher.matches());
    }
    public static boolean mobileNumberValidation(String value){
        Pattern pattern = Pattern.compile("^[1-9]{1}+[0-9]{1}+[-][0-9]{10}$");
        Matcher matcher = pattern.matcher(value);
        return (matcher.matches());
    }
    public static boolean passwordValidation(String value){
        Pattern pattern = Pattern.compile("^[1-9a-zA-Z]{8}$");
        Matcher matcher = pattern.matcher(value);
        return (matcher.matches());
    }

    public static void main(String[] args) {
        System.out.println("USER REGISTRATION WITH REGEX");
        userDataValidation();
    }
}
