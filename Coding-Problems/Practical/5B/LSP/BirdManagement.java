package LSP;

public class BirdManagement {
    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird sparrow = new Bird();
        Ostrich ostrich = new Ostrich();

        // This works fine
        makeBirdFly(sparrow);

        // This will throw an exception
        makeBirdFly(ostrich);
    }
}