// Name: Josue Gonzalez-Silva
// Date: 7/15/24
// Class CS 145
// Assignment: Employee Hierarchy
// Purpose: To represent a date with validation for month, day, and year

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = 
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // constructor
    public Date(int month, int day, int year) {
        
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
                "month (" + month + ") must be 1-12");
        }

        // check
        if (day <= 0 || 
            (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + 
                ") out-of-range for the specified month and year");
        }

        // check
        if (month == 2 && day == 29 && !(year % 400 == 0 || 
            (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + 
                ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    // Getter methods
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // return a String of the form month/day/year
    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
