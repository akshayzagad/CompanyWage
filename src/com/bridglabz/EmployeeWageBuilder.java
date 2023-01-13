package com.bridglabz;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWageBuilder implements WageBuilder {
    static ArrayList<CompanyEmpWage> companyEmpWageList = new ArrayList<>();

    static int getTotalWageByCompany(String companyName) {
        for (CompanyEmpWage cmp : companyEmpWageList) {//wh,tw,varable
            if (companyName.equals(cmp.getCompanyName())) {
                return cmp.getTotalWage();
            }
        }
        return 0;
    }

    static List getDailyWageByCompany(String companyName) {
        for (CompanyEmpWage cmp : companyEmpWageList) {
            if (companyName.equals(cmp.getCompanyName())) {
                return cmp.getDailyEmployeeWage();
            }
        }
        return null;
    }

    @Override
    public int calculateWage(CompanyEmpWage companyEmpWage) {
        int day = 1;
        int totalWage = 0;
        int workingHours = 0;
        while (day < companyEmpWage.getWorkingDaysPerMonth() && companyEmpWage.getWorkingHours() < companyEmpWage.getWorkingHoursPerMonth()) {
            int dailyWage = calculateDailyWage(companyEmpWage, workingHours);
            companyEmpWage.getDailyEmployeeWage().add(dailyWage);
            totalWage = totalWage + dailyWage;
            day++;
        }
        System.out.println("Total Wage Of Employe for Month is => " + totalWage);
        System.out.println("Total Wage Of Employe for day is => " + day);
        System.out.println("Total Working hour  for Month is => " + companyEmpWage.getWorkingHours());
        companyEmpWage.setTotalWage(totalWage);
        return totalWage;
    }

    @Override
    public int calculateDailyWage(CompanyEmpWage companyEmpWage, int workingHours) {
        int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(employeeAttendance);
        int dailyWage = 0;
        switch (employeeAttendance) {
            case Is_Full_Time_Hour:
                System.out.println("Employee is Present");
                dailyWage = companyEmpWage.getWagePerHour() * Full_Time_Hour;
                companyEmpWage.setWorkingHours(companyEmpWage.getWorkingHours() + Full_Time_Hour);
                System.out.println("Employee Daily Wage Is " + dailyWage);
                break;
            case Is_Part_Time_Hour:
                dailyWage = companyEmpWage.getWagePerHour() * Part_Time_Hour;
                companyEmpWage.setWorkingHours(companyEmpWage.getWorkingHours() + Full_Time_Hour);
                System.out.println("Employee is Part Time");
                System.out.println("Employee Daily Wage Is " + dailyWage);
                break;
            default:
                System.out.println("Absent");
        }
        return dailyWage;
    }
}

