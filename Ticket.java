import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ticket {
    public int id;
    public String title;
    public String category;
    public String priority;
    public String description;
    public LocalDateTime dateCreated;
    public String createdBy;
    public String status;
    public ArrayList<String> updateHistory;    
    public static int ticketCounter = 0;

    public Ticket(String title, String category, String priority, String description, LocalDateTime dateCreated, String createdBy, String status) {
        this.id = ticketCounter;
        this.title = title;
        this.category = category;
        this.priority = priority;
        this.description = description;
        this.dateCreated = dateCreated;
        this.createdBy = createdBy;
        this.status = status;
        this.updateHistory = new ArrayList<>();
        ticketCounter++;
    }
}


