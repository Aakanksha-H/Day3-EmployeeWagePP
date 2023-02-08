package com.bridgelabz.employewage;

import java.util.Scanner;

public class Main {
    final int FULL_TIME = 1;
    final int PART_TIME = 2;

    public void calculationOfWage(final int DAILY_WAGE, int totalWorkingDaysForCompany, int totalWorkingHoursForCompany) {

        int workingHours = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        System.out.println("How many employees are there?");
        Scanner scanner = new Scanner(System.in);
        int noOfEmployees = scanner.nextInt();

        int totalWageForCompany = (DAILY_WAGE * totalWorkingDaysForCompany * totalWorkingHoursForCompany) * noOfEmployees;
        System.out.println("Tota wage for company = " + totalWageForCompany);
        // Computation
        for (int i = 1; i <= noOfEmployees; i++) {
            System.out.println("EMPLOYEE WAGE CALCULATION FOR EMPLOYEE " + i);
            while (totalWorkingHours < totalWorkingHoursForCompany && totalWorkingDays < totalWorkingDaysForCompany) {
                int dayCheck = (int) (Math.round(Math.random() * 10) % 3);
                switch (dayCheck) {
                    case FULL_TIME:
                        int empDailyWage = DAILY_WAGE * workingHours;

                        workingHours = 8;

                        totalWorkingHours = workingHours + totalWorkingHours;
                        totalWorkingDays++;

                        System.out.println("Employee is Present Today" + "\r\n" + "Total Wage for Today = " + empDailyWage);
                        System.out.println("Employee total working hours = " + totalWorkingHours);

                        if (totalWorkingHours > totalWorkingHoursForCompany)
                            totalWorkingHours = totalWorkingHours - workingHours;
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
                System.out.println("Employee total working days = " + totalWorkingDays);
                System.out.println("Employee total working hours = " + totalWorkingHours);

                //Total wage for employee
                int totalWage = totalWorkingHours * DAILY_WAGE;
                System.out.println("Wage for an month = " + totalWage + "\r\n");
            }
        }
    }
}
