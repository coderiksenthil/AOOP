package SRP;

public class Main {
    public static void main(String[] args) {
        // Create employee instances
        Employee emp1 = new Employee("Alice", "Manager");
        Employee emp2 = new Employee("Bob", "Developer");
        Employee emp3 = new Employee("Charlie", "Designer");

        // Create a SalaryCalculator instance
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        // Calculate and display salaries
        System.out.println(emp1.getName() + "'s salary: $" + salaryCalculator.calculateSalary(emp1));
        System.out.println(emp2.getName() + "'s salary: $" + salaryCalculator.calculateSalary(emp2));
        System.out.println(emp3.getName() + "'s salary: $" + salaryCalculator.calculateSalary(emp3));
    }
}
