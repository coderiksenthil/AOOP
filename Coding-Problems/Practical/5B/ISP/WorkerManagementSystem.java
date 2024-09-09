package ISP;

public class WorkerManagementSystem {
    public static void main(String[] args) {
        Worker robot = new Robot();
        Worker human = new Human();
        Eater humanEater = (Eater) human;

        // Demonstrate the Robot only works
        System.out.println("Robot:");
        robot.work();

        // Demonstrate the Human works and eats
        System.out.println("\nHuman:");
        human.work();
        humanEater.eat();
    }
}
