public class FulltimeEmployee extends Employee {
    private final double bonus;

    public FulltimeEmployee(String id, String name, double baseSalary, double bonus) {

        super(id, name, baseSalary);
        if (bonus < 0) throw new IllegalArgumentException("bonus must be >= 0");
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}