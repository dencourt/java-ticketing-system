package controller;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminManager {
    public static void adminLogin() {
        Scanner adminLoginScanner = new Scanner(System.in);

        ArrayList<String> adminAccounts = new ArrayList<String>();
        ArrayList<String> adminPasswords = new ArrayList<String>();

        adminAccounts.add("courtney-mir");
        adminPasswords.add("");
        adminAccounts.add("phil-ng");
        adminPasswords.add("");

        System.out.println("Please enter your username.");
        System.out.println("Your username should be entered in the format: firstname-surname");
        System.out.println("Example: jane-doe");
        System.out.println();
        System.out.print("Username: ");
        String username = adminLoginScanner.nextLine();

        boolean usernameFound = Validation.checkUsername(username, adminAccounts);

        if (!(usernameFound)) {
            System.out.println("No user found.");

            System.out.println("User found.");
            System.out.println(">>>Call admin menu");
            //Call admin menu method
        }
    }
    
}
