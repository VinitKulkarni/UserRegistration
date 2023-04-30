package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationMain {
    public static void userDataValidation(){
        Scanner sc = new Scanner(System.in);
        String fName = null, lName = null;

        int temp = -1;
        while(temp != 0) {
            System.out.println("1.FirstName 2.LastName 7.Exit");
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

    public static void main(String[] args) {
        System.out.println("USER REGISTRATION WITH REGEX");
        userDataValidation();
    }
}
