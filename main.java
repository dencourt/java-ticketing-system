import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Login Menu
        System.out.println("Welcome to the ticketing system.");
        System.out.println();
        System.out.println("Please choose your account type:");
        System.out.println("1. User");
        System.out.println("2. Admin");
        System.out.println("3. Exit");
        System.out.println();
        System.out.print("Enter choice: ");

        int loginChoice = scanner.nextInt();
        System.out.println();

        while (loginChoice < 1 || loginChoice > 3) {
            System.out.println("Invalid input. Please select between 1 and 3.");
            System.out.print("Enter choice: ");
            loginChoice = scanner.nextInt();
            System.out.println(loginChoice);
        }

        if (loginChoice == 1) {
            System.out.println("Call user menu method");
        } else if (loginChoice == 2) {
            System.out.println("Call admin menu method");
        } else {
            System.out.println("Thank you for using the ticketing service.");
            System.out.println("We hope you enjoyed using our services.");
        }
    }

}