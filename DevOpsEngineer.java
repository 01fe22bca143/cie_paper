public class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int employeeId, double salary, double bonus) {
        super(name, employeeId, salary);
        this.bonus = bonus;
    }

    public double calculateTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }

    public static void main(String[] args) {
        DevOpsEngineer devOps = new DevOpsEngineer("John Doe", 12345, 60000, 5000);
        devOps.displayDetails();
    }
}