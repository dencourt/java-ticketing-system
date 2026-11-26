package model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Ticket {
    public String id;
    public String title;
    public String category;
    public String priority;
    public String description;
    public LocalDateTime dateCreated;
    public String createdBy;
    public String status;
    public ArrayList<TicketHistory> ticketHistory;

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public Ticket(String id, String title, String category, String priority, String description, LocalDateTime dateCreated, String createdBy, String status) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.priority = priority;
        this.description = description;
        this.dateCreated = dateCreated;
        this.createdBy = createdBy;
        this.status = status;
        this.ticketHistory = new ArrayList<>();
    }

    public String toString() {
        return "Ticket ID: " + id + "\nTitle: " + title + "\nCategory: " + category + "\nPriority: " + priority + "\nDescription: " + description + "\nDate Created: " + dateCreated.format(dateFormat) + "\nCreated By: " + createdBy + "\nStatus: " + status + "\n";
    }
}


