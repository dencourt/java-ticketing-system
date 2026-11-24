package controller;

public class AppManager {

    public static void accountMenu() {
        System.out.println("Please choose your account type:");
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        System.out.println();

        int loginChoice = Validation.validateInt(1, 3);

        switch (loginChoice) {
            case 1:
                UserManager.userLogin();
                break;
            case 2:
                AdminManager.adminLogin();
                break;
            case 3:
                exitProgramme();
        }
    }

    // Exit Programme
    public static void exitProgramme() {
        System.out.println("Thank you for using the ticketing service.");
        System.out.println("We hope you enjoyed using our services.");
    }
}