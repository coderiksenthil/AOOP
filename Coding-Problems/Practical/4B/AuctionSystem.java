public class AuctionSystem {
    public static void main(String[] args) {
        Auction auction = new Auction();

        Bidder alice = new Bidder("Alice");
        Bidder bob = new Bidder("Bob");

        auction.addObserver(alice);
        auction.addObserver(bob);

        auction.setItemDetails("Vintage Car");
        auction.startBidding();
        auction.endBidding();

        // Optionally, unsubscribe a bidder
        auction.removeObserver(bob);
        auction.setItemDetails("Antique Vase");
        auction.startBidding();
    }
}
