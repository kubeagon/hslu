public class Main {

    public static void main(String[] args) {

        PayrollSystem payroll = new PayrollSystem();

        try {
            payroll.addEmployee(new FulltimeEmployee("E01", "Anna", 6000, 800));

            // trigger custom exception
            payroll.addEmployee(new FulltimeEmployee("E01", "Anna", 6000, 800));
        } catch (DuplicateEmployeeIdException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--- Employees ---");
        payroll.printAll();

        double total = payroll.totalPayroll(payroll.getEmployeesInOrder());
        System.out.println("\nTotal payroll: " + total);
    }
}