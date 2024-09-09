package iii;

import java.util.Queue;

public interface TicketQueue {
    void addTicket(Ticket ticket);
    void processNextTicket();
    void displayPendingTickets();
}