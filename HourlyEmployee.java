//  Name: Josue Gonzalez-Silva
//  Date: 7/16/24
//  Class CS 145
//  Assignment: Employee Hierarchy
//  Purpose: To describe a staff member who earns based on hourly wages

public class HourlyEmployee extends Employee {
    private double hourlyWage; // wage per hour
    private double hoursWorked; // hours worked for the week

    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, 
                          double hourlyWage, double hoursWorked, Date birthDate) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if (hourlyWage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        if (hoursWorked < 0.0 || hoursWorked > 168.0) { // 168 hours in a week
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }

        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    // Getter and setter methods
    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked < 0.0 || hoursWorked > 168.0) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Calculate earnings
    public double earnings() {
        return getHourlyWage() * getHoursWorked();
    }

    // Override toString method
    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%nHourly Wage: %.2f%nHours Worked: %.2f",
                super.toString(), getHourlyWage(), getHoursWorked());
    }
}
