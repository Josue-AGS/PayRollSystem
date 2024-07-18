// Name: Josue Gonzalez-Silva
// Date: 7/13/24
// Class CS 145
// Assignment: Employee Hierarchy
// Purpose: To represent an employee who earns a base salary and a commission based on their sales performance

public class BasePlusCommissionEmployee extends Employee {
    private CommissionEmployee commissionEmployee; // composition
    private double baseSalary; // base salary per week

    // Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary, Date birthDate) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, birthDate);
        this.baseSalary = baseSalary;
    }

    // Getter and setter methods
    public void setGrossSales(double grossSales) {
        commissionEmployee.setGrossSales(grossSales);
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public void setCommissionRate(double commissionRate) {
        commissionEmployee.setCommissionRate(commissionRate);
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }

    // Getter and setter methods
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Calculate earnings
    @Override
    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    // Override toString() method
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried",
                             commissionEmployee.toString(), "base salary", getBaseSalary());
    }
}
