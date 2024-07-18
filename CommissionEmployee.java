//  Name: Josue Gonzalez-Silva
//  Date: 7/12/24
//  Class CS 145
//  Assignment: Employee Hierarchy
//  Purpose: To describe a staff member who earns based on their weekly sales commission

public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // Constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate, Date birthdDate) {
        super(firstName, lastName, socialSecurityNumber, birthdDate);

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Getter and setter methods
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    // Getter and setter methods
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // Calculate earnings
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("Commission Employee: %s%nGross Sales: %.2f%nCommission Rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }
}
