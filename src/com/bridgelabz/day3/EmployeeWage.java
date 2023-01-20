package com.bridgelabz.day3;

public class EmployeeWage {
    static final int DAILY_WAGE = 20;
    static final int FULL_TIME = 1;
    static final int PART_TIME = 2;

    public static void main(String[] args) {
        System.out.println("WELCOME_EMPLOYEE_TO_DAILY_WAGE_COMPUTATION");
        int workingHours = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        // Computation
        while (totalWorkingDays < 20) {
            int dayCheck = (int) (Math.round(Math.random() * 10) % 3);

            switch (dayCheck) {
                case FULL_TIME:
                    int empDailyWage = DAILY_WAGE * workingHours;

                    workingHours = 8;

                    totalWorkingHours = workingHours + totalWorkingHours;
                    totalWorkingDays++;

                    System.out.println("Employee is Present Today" + "\r\n" + "Total Wage for Today = " + empDailyWage);
                    System.out.println("Employee total working hours = " + totalWorkingHours );
                    break;

                case PART_TIME:
                    int empDailyPartTimeWage = DAILY_WAGE * workingHours;

                    workingHours = 4;

                    totalWorkingHours = workingHours + totalWorkingHours;
                    totalWorkingDays++;

                    System.out.println("Employee is Present and Working Part Time today" + "\r\n" + "Total Wage for Today = " + empDailyPartTimeWage);
                    System.out.println("Employee total working hours = " + totalWorkingHours);
                    break;

                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println(totalWorkingDays);
            int totalWage = totalWorkingHours * DAILY_WAGE;
            System.out.println("Wage for an month = " + totalWage);
        }
    }
}
