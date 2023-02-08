package com.bridgelabz.employewage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME_EMPLOYEE_TO_DAILY_WAGE_COMPUTATION");
        System.out.println("Which company info you want? type the index");
        Scanner scanner = new Scanner(System.in);
        int companyIndex = scanner.nextInt();

        CompanyEmpWage companyEmpWage = new CompanyEmpWage();

        switch (companyIndex){
            case 1:
                companyEmpWage.company1();
                break;

            case 2:
                companyEmpWage.company2();
                break;
        }
    }
}
