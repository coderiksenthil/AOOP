import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList implements Iterable<Employee> {
    private List<Employee> employees;

    public EmployeeList() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortById() {
        employees.sort(Employee::compareTo);
    }

    public void sortByName(EmployeeComparator comparator) {
        employees.sort(comparator);
    }

    @Override
    public Iterator<Employee> iterator() {
        return employees.iterator();
    }
}