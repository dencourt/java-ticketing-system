package controller;

import java.util.ArrayList;
import java.util.Scanner;


public class Validation {
    private static Scanner scanner = new Scanner(System.in);

    // Checks an input int is between a specified range
    public static int validateInt(int lowestValue, int highestValue) {
        int input;
        
        do {
            System.out.print("Enter choice: ");
            input = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (input < lowestValue || input > highestValue) {
                System.out.println("Invalid input. Please select between " + lowestValue + " and " + highestValue + ".");
            }
            
        } while (input < lowestValue || input > highestValue);

        return input;
    }

    public static String validateString(String prompt) {
        String input;

        do {
            System.out.print(prompt +": ");
            input = scanner.nextLine();
            System.out.println();

            if (input.length() < 1) {
                System.out.println(prompt + " cannot be empty. Please enter a valid " + prompt.toLowerCase() + ".");
            }
        } while (input.length() < 1);

        return input;
    }

    public static String validateYesNo() {
        String input;

        do {
            System.out.print("Enter choice: ");
            input = scanner.nextLine();
            System.out.println();
            input = input.toLowerCase();

            if (!input.equals("y") && !input.equals("n")) {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!input.equals("y") && !input.equals("n"));

        return input;
    }

    public static boolean checkPassword(String password) {
        String input;
        int passwordAttempts = 5;
        
        do {
            System.out.print("Enter password: ");
            input = scanner.nextLine();
            System.out.println();

            if (!input.equals(password)) {
                passwordAttempts--;
                System.out.println("Incorrect password. Please try again.");
                System.out.println("You have " + passwordAttempts + " attempts remaining.");
                System.out.println();
            } else {
                return true;
            }
        } while (!(input.equals(password)) && passwordAttempts > 0);
        return false;
    }


    // Checks if username already exits in programme
    public static boolean checkUsername(String username, ArrayList<String> accounts) {
        username = username.toLowerCase();
        for (int i = 0; i < accounts.size(); i++) {
            if (username.equals(accounts.get(i))) {
                return true;
            }
        }
        return false;
    }
    
}