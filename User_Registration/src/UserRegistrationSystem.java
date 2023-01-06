import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationSystem {
    //declaring Patterns
    static String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
    static String lastNameRegex = "^[A-Z]{1}[a-z]{3,}$";
    static String emailRegexPattern = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

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

    public static void main(String[] args) {
        validateFirstName();
        validateLastName();
        validateMail();
    }
}