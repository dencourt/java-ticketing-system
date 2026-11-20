import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args) {
        Scanner mainScanner = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();

        //Sample closed tickets
        Ticket ticket1 = new Ticket("BSOD!!!", "Hardware", "Critical", "My computer crashed this afternoon and I lost all of my work!! The blue screen of death showed up unexpectedly when I was on a call and it made a loud beep and restarted. All of the work I was doing is now lost. I need it fixing urgently and my work retreived ASAP!", LocalDateTime.of(2026, 11, 18, 10, 0), "Harold", "Closed");
        Ticket ticket2 = new Ticket("Video call broke", "Account", "High", "I have a problem with my microphone not working. When I'm in a teams call, no one can hear me even if I shout out loud can you hear me can you hear me? But they can't. It's broken. I need a new laptop please for video calls.", LocalDateTime.of(2026, 11, 19, 9, 30), "Abigail", "Closed");
        Ticket ticket3 = new Ticket("KeyboardNotWorking", "Hardware", "High", "TheSpacebarOnMyLaptopIsNotWorkingIhavebeenTryingToSeeifSomethingisstuckUnderButIcan'tGetunderThekeys.", LocalDateTime.of(2026, 11, 18, 11, 0), "John", "Closed");
        Ticket ticket4 = new Ticket("Computer freezing", "Software", "Low", "My computer keeps getting really hot and loud and then freezing. I received an email yesterday telling me my antivirus software had expired, so I installed the new version but it seems to have not worked properly because now I keep having this freezing problem.", LocalDateTime.of(2026, 11, 20, 14, 0), "Paul", "Closed");
        Ticket ticket5 = new Ticket("Virus!!!", "Network", "Critical", "I think a virus has infected my computer. I can see a device called Chrissy on my network and there isn't anyone called Chrissy in the office. Please resolve this quickly before it takes my documents!", LocalDateTime.of(2026, 11, 19, 9, 30), "Gail", "Closed");

        //Sample open tickets
        //Ticket ticket6 = new Ticket("Computer screen flickering", "Hardware", "Low", "Yesterday afternoon at 2pm, my computer screen started flickering. It flickers for a few seconds, then goes back to normal. This has happened several times since yesterday. There are no error messages, and nothing happened prior to the flickering.", LocalDateTime.of(2026, 11, 20, 14, 0), "Jonathon", "Open");
        //Ticket ticket7 = new Ticket("Emails not loading", "Account", "High", "I log onto my emails in the Outlook app but cannot see any emails. I've tried logging in and out and have checked the bin but there is still nothing there. It started this morning but I can't fix it and I urgently need my emails to work.", LocalDateTime.of(2026, 11, 19, 9, 30), "Abigail", "Open");
        //Ticket ticket8 = new Ticket("Cannot connect to the printer", "Network", "Medium", "I have been trying to print out some documents but there are no printing options. I can only see print to pdf. I asked a colleague for help and the printer showed up on their laptop.", LocalDateTime.of(2026, 11, 20, 13, 40), "Liz", "Open");

        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        //tickets.add(ticket6);
        //tickets.add(ticket7);
        //tickets.add(ticket8);

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

    ///////////////////////////////////////////////////////
    // User main menu
    public static void userMainMenu(String user) {
        Scanner userMenuScanner = new Scanner(System.in);

        System.out.println("Welcome " + user);
        System.out.println();

        System.out.println("Please select an option from the menu:");
        System.out.println("1. Create a new ticket");
        System.out.println("2. View my tickets");
        System.out.println("3. Logout");
        System.out.println();

        int userMenuChoice;

        do {
            System.out.print("Enter choice: ");
            userMenuChoice = userMenuScanner.nextInt();
            System.out.println();

            if (userMenuChoice < 1 || userMenuChoice > 4) {
                System.out.println("Invalid input. Please select between 1 and 3.");
            }
        } while (userMenuChoice < 1 || userMenuChoice > 3);

        if (userMenuChoice == 1) {
            createNewTicket(user);
        } else if (userMenuChoice == 2) {
            System.out.println(">>>Call view my tickets method");
        } else if (userMenuChoice == 3) {
            System.out.println(">>>Call logout method");
        }
    }

    // Create a new ticket
    public static void createNewTicket(String user) {
        Scanner newTicketScanner = new Scanner(System.in);
        String[] categories = {"Hardware", "Software", "Network", "Account"};
        String[] priorities = {"Low", "Medium", "High", "Critical"};

        System.out.println("Create a new ticket.");

        System.out.println("Please provide a clear title for your issue.");
        System.out.print("Title: ");
        String title = newTicketScanner.nextLine();
        System.out.println();

        System.out.println("Please select a category for your issue.");

        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        int categoryChoice;

        do {
            System.out.print("Enter choice: ");
            categoryChoice = newTicketScanner.nextInt();
            System.out.println();

            if (categoryChoice < 1 || categoryChoice > categories.length) {
                System.out.println("Invalid input. Please select between 1 and " + categories.length + ".");
            } 
        } while (categoryChoice < 1 || categoryChoice > categories.length);

        String category = categories[categoryChoice - 1];

        System.out.println("Please select a priority for your issue.");
        for (int i = 0; i < priorities.length; i++) {
            System.out.println((i + 1) + ". " + priorities[i]);
        }

        int priorityChoice;

        do {
            System.out.print("Enter choice: ");
            priorityChoice = newTicketScanner.nextInt();
            System.out.println();

            if (priorityChoice < 1 || priorityChoice > priorities.length) {
                System.out.println("Invalid input. Please select between 1 and " + priorities.length + ".");
            } 
        } while (priorityChoice < 1 || priorityChoice > priorities.length);

        String priority = priorities[priorityChoice - 1];
        newTicketScanner.nextLine();

        System.out.println("Please provide a detailed description of your issue, including any error messages and when the issue began.");
        System.out.print("Description: ");
        String description = newTicketScanner.nextLine();
        System.out.println();

        System.out.print("Confirm submission? (Y/N)");
        String confirmation;

        do {
            confirmation = newTicketScanner.nextLine();
            System.out.print("Enter choice: ");
            System.out.println();

            confirmation = confirmation.toLowerCase();

            if (confirmation.equals("y")) {
                LocalDateTime date = LocalDateTime.now();
                Ticket newTicket = new Ticket(title, category, priority, description, date, user, "Open");
                System.out.println("Thank you. Your ticket has been submitted successfully.");
                System.out.println();
                System.out.println("Here are your ticket details:");
                System.out.println("Ticket ID: " + newTicket.id);
                System.out.println("Title: " + newTicket.title);
                System.out.println("Category: " + newTicket.category);
                System.out.println("Priority: " + newTicket.priority);
                System.out.println("Description: " + newTicket.description);
                System.out.println("Date Created: " + newTicket.dateCreated);
                System.out.println("Created By: " + newTicket.createdBy);
                System.out.println("Status: " + newTicket.status);
                System.out.println();
                System.out.println("A member of the support team will review your case and get in touch within the next 48 hours.");
                System.out.println();
            } else if (confirmation.equals("n")) {
                System.out.println("Ticket creation cancelled.");
                System.out.println();
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        } while (!(confirmation.equals("y") || confirmation.equals("n")));
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
