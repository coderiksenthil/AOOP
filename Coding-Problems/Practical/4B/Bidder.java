public class Bidder implements Observer {
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType, String itemDetails) {
        System.out.println(name + " received update: " + eventType + " - " + itemDetails);
    }
}
