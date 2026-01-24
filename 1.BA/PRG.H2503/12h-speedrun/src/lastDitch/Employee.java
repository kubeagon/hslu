public abstract class Employee implements Payable {

    private final String id; // Can only be modified in class and can only be assigned once
    private final String name;
    protected final double baseSalary; // Can only be accessed inside of class and subclasses and package

    public Employee(String id, String name, double baseSalary) {

        if (id == null || id.isBlank()) throw new IllegalArgumentException("id is required");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name is required");
        if (baseSalary < 0 ) throw new IllegalArgumentException("baseSalary must be >= 0");

        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return id + "-" + name + "( salary=" + calculateSalary() + ")";
    }


}