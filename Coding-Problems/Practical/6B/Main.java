public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();

        employeeList.addEmployee(new Employee(3, "John", 25));
        employeeList.addEmployee(new Employee(1, "Alice", 30));
        employeeList.addEmployee(new Employee(2, "Bob", 28));

        System.out.println("Before sorting:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        employeeList.sortById();
        System.out.println("After sorting by ID:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        EmployeeComparator comparator = new EmployeeComparator();
        employeeList.sortByName(comparator);
        System.out.println("After sorting by Name:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}