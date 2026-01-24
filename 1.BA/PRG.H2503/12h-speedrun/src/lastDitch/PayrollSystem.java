import java.util.*;

public class PayrollSystem {

    private final Map<String, Employee> employeesById = new HashMap<>();
    private final List<Employee> employeesInOrder = new ArrayList<>();

    public void addEmployee(Employee e) throws DuplicateEmployeeIdException {

        if (employeesById.containsKey(e.getId())) {
            throw new DuplicateEmployeeIdException("Employee ID already exists: " + e.getId());
        }

        employeesById.put(e.getId(), e);
        employeesInOrder.add(e);

    }

    public void printAll() {
        for (Employee e : employeesInOrder) {
            System.out.println(e);
        }
    }
    
    public double totalPayroll(List<? extends Payable> payables) {
        double sum = 0.0;
        for (Payable p : payables) {
            sum += p.calculateSalary();
        }
        return sum;
    }

    public List<Employee> getEmployeesInOrder() {
        return employeesInOrder;
    }
}