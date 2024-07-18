//  Name: Josue Gonzalez-Silva
//  Date: 7/12/24
//  Class CS 145
//  Assignment: Employee Hierarchy
//  Purpose: To represent and manage basic information about a staff member

public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }

    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // Abstract method for earnings
    public abstract double earnings();

    // toString method
    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s\nbirth date: %s",
                             getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }
}
