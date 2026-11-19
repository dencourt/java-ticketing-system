import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);

        //Login Menu
        System.out.println("========================================");
        System.out.println("    Welcome to the ticketing system.    ");
        System.out.println("========================================");
        System.out.println();
        System.out.println("Please choose your account type:");
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        System.out.println();

        int loginChoice;

        do {
            System.out.print("Enter choice: ");
            loginChoice = mainScanner.nextInt();
            System.out.println();

            switch (loginChoice) {
                case 1:
                    userLogin();
                    break;
                case 2:
                    adminLogin();
                    break;
            }

            if (loginChoice < 1 || loginChoice > 3){
                System.out.println("Invalid input. Please select between 1 and 3."); 
            }

        } while(loginChoice < 1 || loginChoice > 3);
        
        //System.out.println("Thank you for using the ticketing service.");
        //System.out.println("We hope you enjoyed using our services.");
    }
    
    //User login
    public static void userLogin() {
        Scanner userLoginscanner = new Scanner(System.in);
        String[] userAccounts = {"Abigail", "Briony", "Charlotte"};
        int exitInt = userAccounts.length + 1;

        System.out.println("Please select your account:");

        for (int i = 0; i < userAccounts.length; i++) {
            System.out.println((i + 1) + ". " + userAccounts[i]);
        }
        System.out.println((exitInt) + ". Exit");
        System.out.println();

        int userChoice;

        do {
            System.out.print("Enter choice: ");
            userChoice = userLoginscanner.nextInt();
            System.out.println();

            if (userChoice >= 1 && userChoice < exitInt) {
                String user = userAccounts[userChoice - 1];
                System.out.println("Login successful.");
                userMainMenu(user);
            } else if (userChoice < 1 || userChoice > exitInt) {
                System.out.println("Invalid input. Please select between 1 and " + exitInt + ".");
            }
        } while (userChoice < 1 || userChoice > exitInt);
    }

    public static void userMainMenu(String user) {
        System.out.println("Welcome " + user);
        System.out.println();

        System.out.println("Please select an option from the menu:"); 
    }

    //Admin login
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

        boolean usernameFound = checkUsername(username, adminAccounts);

        if (!(usernameFound)) {
            System.out.println("No user found.");
            //Add a new user or go back to main menu method here?
        } else {
            System.out.println("User found.");
            System.out.println(">>>Call admin menu");
            //Call admin menu method
        }
    }

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
