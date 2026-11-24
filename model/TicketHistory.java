package model;
import java.time.LocalDateTime;

public class TicketHistory {
    private String status;
    private LocalDateTime date;
    private String comment;

    public TicketHistory(String status, LocalDateTime date, String comment) {
        this.status = status;
        this.date = date;
        this.comment = comment;
    }

    public String toString() {
        return "Status: " + status + "\nDate: " + date + "\nComment: " + comment;
    } 
}
