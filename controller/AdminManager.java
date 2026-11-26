package controller;

public class AdminManager {
    public static void adminLogin() {
        String adminPassword = "Admin123";
        boolean passwordCorrect = Validation.checkPassword(adminPassword);

        if (passwordCorrect) { 
            System.out.println("Login successful.");
            adminMainMenu();
        } else {
            System.out.println("Incorrect password. You will now be redirected to the main menu.");
            AppManager.accountMenu();
        }
    }

    public static void adminMainMenu() {
        System.out.println("Welcome Admin");
        TicketManager.viewTicketSummary();
    }


    
}
