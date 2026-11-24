package controller;

import java.time.LocalDateTime;
import java.util.Scanner;
import model.Ticket;

public class TicketManager {
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
    
}
