package SRP;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        switch (employee.getRole()) {
            case "Manager":
                return calculateManagerSalary();
            case "Developer":
                return calculateDeveloperSalary();
            case "Designer":
                return calculateDesignerSalary();
            default:
                throw new IllegalArgumentException("Unknown role: " + employee.getRole());
        }
    }

    private double calculateManagerSalary() {
        return 80000; // Example salary for a Manager
    }

    private double calculateDeveloperSalary() {
        return 60000; // Example salary for a Developer
    }

    private double calculateDesignerSalary() {
        return 50000; // Example salary for a Designer
    }
}
