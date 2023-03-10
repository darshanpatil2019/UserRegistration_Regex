import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationSystem {
    //declaring Patterns
    static String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
    static String lastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
    static String emailRegexPattern = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    static String mobileNumberRegexPattern = "^[9,1]{2}?[0-9]{10}$";
    static String passwordRegexPatternRule4 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()<>]).{8,}$";
    //UC1- Method to validate First Name

    public static void validateFirstName() {
        System.out.println("Enter First Name :- ");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("FirstName is Valid");
        } else {
            System.out.println("FirstName is Invalid");
        }
    }

    //UC2- Method to validate Last Name

    public static void validateLastName() {
        System.out.println("Enter Last Name :- ");
        Scanner sc = new Scanner(System.in);
        String lastName = sc.nextLine();
        Pattern pattern = Pattern.compile(lastNameRegex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("LastName is Valid");
        } else {
            System.out.println("LastName is Invalid");
        }
    }

    //UC3- Method to validate Email

    public static void validateMail() {
        System.out.println("Enter mail ID :- ");
        Scanner sc = new Scanner(System.in);
        String eMailID = sc.nextLine();
        Pattern pattern = Pattern.compile(emailRegexPattern);
        Matcher matcher = pattern.matcher(eMailID);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Mail ID is Valid");
        } else {
            System.out.println("Mail ID is Invalid");
        }
    }
    // UC4 - Method to Validate MobileNumber

    public static void validateMobileNumber() {
        System.out.println("Enter Mobile Number :- ");
        Scanner sc = new Scanner(System.in);
        String mobileNumber = sc.next();
        Pattern pattern = Pattern.compile(mobileNumberRegexPattern);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Mobile Number is Valid");
        } else {
            System.out.println("Mobile Number is Invalid");
        }
    }

    // UC5- method to validate password of minimum 8 characters
    public static void validatePasswordRule() {
        System.out.print("Enter Password :- ");
        Scanner sc = new Scanner(System.in);
        String passWord = sc.next();
        Pattern pattern = Pattern.compile(passwordRegexPatternRule4);
        Matcher matcher = pattern.matcher(passWord);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }

    public static void main(String[] args) {
        validateMail();
    }
}

/* A. Valid Emails
??? 1. abc@yahoo.com,
??? 2. abc-100@yahoo.com,
??? 3. abc.100@yahoo.com
??? 2. abc111@abc.com,
??? 4. abc-100@abc.net,
??? 5. abc.100@abc.com.au
??? 6. abc@1.com,
??? 7. abc@gmail.com.com
??? 8. abc+100@gmail.com */