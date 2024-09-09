package iii;

public class Ticket {
    private String id;
    private String description;

    public Ticket(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}