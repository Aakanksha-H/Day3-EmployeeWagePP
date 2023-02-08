package com.bridgelabz.employewage;

import java.util.Scanner;

abstract class CompanyEmpWage implements EmployeeWageBuilder {
    public void calculationOfWage() {
        int workingHours = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employees are there?");
        int noOfEmployees = scanner.nextInt();

        System.out.println("How much is daily wage");
        int dailyWage = scanner.nextInt();

        System.out.println("How much is total Working Days For Company");
        int totalWorkingDaysForCompany = scanner.nextInt();

        System.out.println("How much is total Working Hours For Company");
        int totalWorkingHoursForCompany = scanner.nextInt();

        int totalWageForCompany = (dailyWage * totalWorkingDaysForCompany * totalWorkingHoursForCompany) * noOfEmployees;
        System.out.println("Tota wage for company = " + totalWageForCompany);
        // Computation
        for (int i = 1; i <= noOfEmployees; i++) {
            System.out.println("EMPLOYEE WAGE CALCULATION FOR EMPLOYEE " + i);
            while (totalWorkingHours < totalWorkingHoursForCompany && totalWorkingDays < totalWorkingDaysForCompany) {
                int dayCheck = (int) (Math.round(Math.random() * 10) % 3);
                switch (dayCheck) {
                    case FULL_TIME:
                        int empDailyWage = dailyWage * workingHours;

                        workingHours = 8;

                        totalWorkingHours = workingHours + totalWorkingHours;
                        totalWorkingDays++;

                        System.out.println("Employee is Present Today" + "\r\n" + "Total Wage for Today = " + empDailyWage);
                        System.out.println("Employee total working hours = " + totalWorkingHours);

                        if (totalWorkingHours > totalWorkingHoursForCompany)
                            totalWorkingHours = totalWorkingHours - workingHours;
                        break;

                    case PART_TIME:
                        int empDailyPartTimeWage = dailyWage * workingHours;

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
                int totalWage = totalWorkingHours * dailyWage;
                System.out.println("Wage for an month = " + totalWage + "\r\n");
            }
        }
    }
}
