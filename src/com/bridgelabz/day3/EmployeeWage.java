package com.bridgelabz.day3;

public class EmployeeWage {
    static int DAILY_WORKING_HOURS = 8;
    static int DAILY_WAGE = 20;
    static int DAY_CHECK = 1;

    public static void main(String[] args) {
        System.out.println("WELCOME_EMPLOYEE_TO_DAILY_WAGE_COMPUTATION");
        int empDailyWage = DAILY_WAGE * DAILY_WORKING_HOURS;
        // Computation
        double empDailyCheck = Math.floor(Math.random() * 10) % 2;
        if (empDailyCheck == DAY_CHECK)
        System.out.println("Employee is Present Today"+ "\r\n" +"Total Wage for Today = " + empDailyWage);
        else
        System.out.println("Employee is Absent Today");
    }
}
