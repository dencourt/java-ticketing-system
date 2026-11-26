package controller;

public class UserManager {
    public static void userLogin() {
        String[] userAccounts = {"Abby", "Bert", "Cathy", "Darren", "Edith"};
        int exitInt = userAccounts.length + 1;

        System.out.println("Please select your account:");

        for (int i = 0; i < userAccounts.length; i++) {
            System.out.println((i + 1) + ". " + userAccounts[i]);
        }
        System.out.println((exitInt) + ". Return to account selection");
        System.out.println();

        int userChoice = Validation.validateInt(1, exitInt);

        if (userChoice == exitInt) {
            AppManager.accountMenu();
        } else {
            String user = userAccounts[userChoice - 1];
            System.out.println("Login successful.");
            userMainMenu(user);
        }
    }

    public static void userMainMenu(String user) {
        System.out.println("Welcome " + user);
        System.out.println();
        System.out.println("Please select an option from the menu:");
        System.out.println("1. Create a new ticket");
        System.out.println("2. View my tickets");
        System.out.println("3. Logout");
        System.out.println();

        int userMenuChoice = Validation.validateInt(1, 3);

        switch (userMenuChoice) {
            case 1:
                TicketManager.createNewTicket(user);
                break;
            case 2:
                System.out.println(">>>Call view my tickets method");
                break;
            case 3:
                userLogin();
        }
    } 
}
