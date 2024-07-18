//  Name: Josue Gonzalez-Silva
//  Date: 7/17/24
//  Class CS 145
//  Assignment: Employee Hierarchy
//  Purpose: To demonstrate the functionality of the CommissionEmployee code

import java.util.Calendar;

public class PayRollSystemTest {
    public static void main(String[] args) {
        // Create Date objects for birthdays
        Date birthDate1 = new Date(5, 24, 1990);
        Date birthDate2 = new Date(8, 15, 1985);
        Date birthDate3 = new Date(11, 30, 1992);
        Date birthDate4 = new Date(7, 20, 1980); 

        // Create Employee objects
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("Miracle", "Jackson", "827-69-9827", 800.00, birthDate1);
        employees[1] = new HourlyEmployee("Skylar", "White", "819-23-2892", 50, 50.23, birthDate2);
        employees[2] = new CommissionEmployee("Jessie", "Storm", "833-47-3873", 10000, 0.06, birthDate3);
        employees[3] = new BasePlusCommissionEmployee("Rob", "Low", "842-54-5625", 5000.0, 0.04, 300, birthDate4);

        // Get the current month
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;

        // Process each employee's payroll
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); 

            // Determine if it is the employee's birthday month
            if (currentEmployee.getBirthDate().getMonth() == currentMonth) {
                System.out.printf("earned $%,.2f (plus $100.00 birthday bonus)%n%n", 
                                  currentEmployee.earnings() + 100);
            } else {
                System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
            }
        }
    }
}
