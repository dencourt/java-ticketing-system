package controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import model.Ticket;
import model.TicketHistory;

public class TicketManager {
    public static int ticketCounter = 1;
    public static ArrayList<Ticket> tickets = new ArrayList<>();

    public static void createNewTicket(String user) {
        String[] categories = {"Hardware", "Software", "Network", "Account"};
        String[] priorities = {"Low", "Medium", "High", "Critical"};

        System.out.println("Create a new ticket.");
        System.out.println("Please provide a clear title for your issue.");
        System.out.println();

        String title = Validation.validateString("Title");

        System.out.println("Please select a category for your issue.");

        for (int i = 0; i < categories.length; i++) {
            System.out.println((i + 1) + ". " + categories[i]);
        }

        System.out.println();
        String category = categories[(Validation.validateInt(1, categories.length) - 1)];

        System.out.println("Please select a priority for your issue.");
        for (int i = 0; i < priorities.length; i++) {
            System.out.println((i + 1) + ". " + priorities[i]);
        }

        System.out.println();
        String priority = priorities[(Validation.validateInt(1, priorities.length) - 1)];
        
        System.out.println("Please provide a detailed description of your issue.");
        System.out.println();
        String description = Validation.validateString("Description");

        System.out.print("Confirm submission? (Y/N)");
        System.out.println();
        String confirmation = Validation.validateYesNo();

        String id = "ID-" + ticketCounter;

        if (confirmation.equals("y")) {
            LocalDateTime date = LocalDateTime.now();
            String status = "Open";
            Ticket newTicket = new Ticket(id, title, category, priority, description, date, user, status);
            tickets.add(newTicket);
            addHistoryUpdate(newTicket, status, date, "Ticket created.");
            ticketCounter++;

            System.out.println("Thank you. Your ticket has been submitted successfully.");
            System.out.println();

            viewTicket(newTicket);

            System.out.println("A member of the support team will review your case and get in touch within the next 48 hours.");
            System.out.println();
        } else if (confirmation.equals("n")) {
            System.out.println("Ticket creation cancelled.");
            System.out.println();
        }
    }

    public static void addHistoryUpdate(Ticket ticket, String status, LocalDateTime date, String comment) {
        TicketHistory history = new TicketHistory(status, date, comment);
        ticket.ticketHistory.add(history);
    }

    public static void viewTicket(Ticket ticket) {
        System.out.println("Here are the ticket details for Ticket: " + ticket.id);
        System.out.println();
        System.out.println(ticket.toString());
        viewTicketHistory(ticket);
    }

    public static void viewTicketHistory(Ticket ticket) {
        System.out.println("Ticket history: ");
        System.out.println();
        for (int i = 0; i < ticket.ticketHistory.size(); i++) {
            System.out.println(ticket.ticketHistory.get(i).toString());
        }
    }

    public static void viewTicketSummary() {
        System.out.println("Ticket Summary:");
        System.out.println();
        System.out.println("There are currently no open tickets");
    }
    
}
