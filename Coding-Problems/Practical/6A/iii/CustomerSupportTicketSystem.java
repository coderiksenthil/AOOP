package iii;

public class CustomerSupportTicketSystem {
    private TicketQueue ticketQueue;

    public CustomerSupportTicketSystem(TicketQueue ticketQueue) {
        this.ticketQueue = ticketQueue;
    }

    public void addTicket(Ticket ticket) {
        ticketQueue.addTicket(ticket);
    }

    public void processNextTicket() {
        ticketQueue.processNextTicket();
    }

    public void displayPendingTickets() {
        ticketQueue.displayPendingTickets();
    }

    public static void main(String[] args) {
        TicketQueue ticketQueue = new LinkedListTicketQueue();
        CustomerSupportTicketSystem ticketSystem = new CustomerSupportTicketSystem(ticketQueue);

        // Create and add tickets to the queue
        Ticket ticket1 = new Ticket("TCK-001", "Issue with login");
        Ticket ticket2 = new Ticket("TCK-002", "Problem with payment processing");
        Ticket ticket3 = new Ticket("TCK-003", "Error with order delivery");

        ticketSystem.addTicket(ticket1);
        ticketSystem.addTicket(ticket2);
        ticketSystem.addTicket(ticket3);

        // Display pending tickets
        ticketSystem.displayPendingTickets();

        // Process next ticket
        ticketSystem.processNextTicket();
    }
}