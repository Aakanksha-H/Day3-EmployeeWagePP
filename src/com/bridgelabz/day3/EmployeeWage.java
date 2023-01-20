package com.bridgelabz.day3;

public class EmployeeWage {
    static final int DAILY_WAGE = 20;
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    public static void main(String[] args) {
        int workingHours = 0;
        // Computation
        int dayCheck = (int) (Math.round(Math.random() * 10) % 3);

        switch (dayCheck) {
            case FULL_TIME:
                workingHours = 8;
                int empDailyWage = DAILY_WAGE * workingHours;
                System.out.println("Employee is Present Today"+ "\r\n" +"Total Wage for Today = " + empDailyWage);
                break;

            case PART_TIME:
                workingHours = 4;
                int empPartTimeWage = DAILY_WAGE * workingHours;
                System.out.println("Employee is Present and Working Part Time today" + "\r\n" + "Total Wage for Today = " + empPartTimeWage);
                break;

            default:
                System.out.println("Employee is Absent");
        }
    }
}
