import controller.AppManager;

public class Main{
    public static void main(String[] args) {
        // Welcome message
        System.out.println("========================================");
        System.out.println("    Welcome to the ticketing system.    ");
        System.out.println("========================================");
        System.out.println();
        AppManager.accountMenu();
        

        // Sample closed tickets
        // ArrayList<Ticket> tickets = new ArrayList<Ticket>();

        // Ticket ticket1 = new Ticket("BSOD!!!", "Hardware", "Critical", "My computer crashed this afternoon and I lost all of my work!! The blue screen of death showed up unexpectedly when I was on a call and it made a loud beep and restarted. All of the work I was doing is now lost. I need it fixing urgently and my work retreived ASAP!", LocalDateTime.of(2026, 11, 18, 10, 0), "Harold", "Closed");
        // Ticket ticket2 = new Ticket("Video call broke", "Account", "High", "I have a problem with my microphone not working. When I'm in a teams call, no one can hear me even if I shout out loud can you hear me can you hear me? But they can't. It's broken. I need a new laptop please for video calls.", LocalDateTime.of(2026, 11, 19, 9, 30), "Abigail", "Closed");
        // Ticket ticket3 = new Ticket("KeyboardNotWorking", "Hardware", "High", "TheSpacebarOnMyLaptopIsNotWorkingIhavebeenTryingToSeeifSomethingisstuckUnderButIcan'tGetunderThekeys.", LocalDateTime.of(2026, 11, 18, 11, 0), "John", "Closed");
        // Ticket ticket4 = new Ticket("Computer freezing", "Software", "Low", "My computer keeps getting really hot and loud and then freezing. I received an email yesterday telling me my antivirus software had expired, so I installed the new version but it seems to have not worked properly because now I keep having this freezing problem.", LocalDateTime.of(2026, 11, 20, 14, 0), "Paul", "Closed");
        // Ticket ticket5 = new Ticket("Virus!!!", "Network", "Critical", "I think a virus has infected my computer. I can see a device called Chrissy on my network and there isn't anyone called Chrissy in the office. Please resolve this quickly before it takes my documents!", LocalDateTime.of(2026, 11, 19, 9, 30), "Gail", "Closed");

        // tickets.add(ticket1);
        // tickets.add(ticket2);
        // tickets.add(ticket3);
        // tickets.add(ticket4);
        // tickets.add(ticket5);
    }
}
