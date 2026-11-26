package model;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TicketHistory {
    private String status;
    private LocalDateTime date;
    private String comment;

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public TicketHistory(String status, LocalDateTime date, String comment) {
        this.status = status;
        this.date = date;
        this.comment = comment;
    }

    public String toString() {
        return "Date: " + date.format(dateFormat) + "\nStatus: " + status + "\nComment: " + comment + "\n";
    } 
}
