package iii;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTicketQueue implements TicketQueue {
    private Queue<Ticket> ticketQueue;

    public LinkedListTicketQueue() {
        this.ticketQueue = new LinkedList<>();
    }

    @Override
    public void addTicket(Ticket ticket) {
        ticketQueue.add(ticket);
        System.out.println("Ticket added successfully!");
    }

    @Override
    public void processNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets available for processing.");
        } else {
            Ticket ticket = ticketQueue.poll();
            System.out.println("Processing ticket: " + ticket.getId() + " - " + ticket.getDescription());
        }
    }

    @Override
    public void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets available.");
        } else {
            System.out.println("Pending Tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket.getId() + " - " + ticket.getDescription());
            }
        }
    }
}