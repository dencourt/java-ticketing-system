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
            System.out.println();

            if (input < lowestValue || input > highestValue) {
                System.out.println("Invalid input. Please select between " + lowestValue + " and " + highestValue + ".");
            }
            
        } while (input < lowestValue || input > highestValue);

        return input;
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