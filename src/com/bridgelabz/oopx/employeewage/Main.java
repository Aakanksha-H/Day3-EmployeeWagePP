package com.bridgelabz.oopx.employeewage;

public class Main {
    final int FULL_TIME = 1;
    final int PART_TIME = 2;

    public void calculationOfWage(final int DAILY_WAGE, int totalWorkingDaysForCompany, int totalWorkingHoursForCompany) {

        int workingHours = 0;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;

        // Computation
        while (totalWorkingHours < 150 && totalWorkingDays < 30) {
            int dayCheck = (int) (Math.round(Math.random() * 10) % 3);

            switch (dayCheck) {
                case FULL_TIME:
                    int empDailyWage = DAILY_WAGE * workingHours;

                    workingHours = 8;

                    totalWorkingHours = workingHours + totalWorkingHours;
                    totalWorkingDays++;

                    System.out.println("Employee is Present Today" + "\r\n" + "Total Wage for Today = " + empDailyWage);
                    System.out.println("Employee total working hours = " + totalWorkingHours);

                    if (totalWorkingHours > 150)
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
            int totalWage = totalWorkingHours * DAILY_WAGE;
            System.out.println("Employee total working hours = " + totalWorkingHours);
            System.out.println("Wage for an month = " + totalWage + "\r\n");
        }
    }
}
