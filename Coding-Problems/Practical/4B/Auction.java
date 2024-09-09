import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String itemDetails;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String eventType, String itemDetails) {
        for (Observer observer : observers) {
            observer.update(eventType, itemDetails);
        }
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
        notifyObservers("Item Available", itemDetails);
    }

    public void startBidding() {
        notifyObservers("Bidding Start", itemDetails);
    }

    public void endBidding() {
        notifyObservers("Bidding End", itemDetails);
    }
}
