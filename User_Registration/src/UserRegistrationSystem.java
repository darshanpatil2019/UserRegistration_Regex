import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationSystem {
    //declaring Patterns
    static String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";

    //UC1- Method to validate First Name

    public static void validateFirstName() {
        System.out.println("Enter First Name :- ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Pattern pattern = Pattern.compile(firstNameRegex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("FirstName is Valid");
        } else {
            System.out.println("FirstName is Invalid");
        }
    }

    public static void main(String[] args) {
        validateFirstName();
    }
}