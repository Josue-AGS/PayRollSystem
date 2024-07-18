//  Name: Josue Gonzalez-Silva
//  Date: 7/16/24
//  Class CS 145
//  Assignment: Employee Hierarchy
//  Purpose: To describe a staff member who earns a fixed salary

public class SalariedEmployee extends Employee {
    private double weeklySalary; // weekly salary

    // Constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary, Date birthDate) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }

        this.weeklySalary = weeklySalary;
    }

    // Getter and setter methods
    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) {
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    // Calculate earnings
    public double earnings() {
        return getWeeklySalary();
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%nWeekly Salary: %.2f",
                super.toString(), getWeeklySalary());
    }
}