package com.bridglabz;

import java.util.ArrayList;

public class CompanyEmpWage {
    private int workingDaysPerMonth;
    private int workingHoursPerMonth;
    private int wagePerHour ;
    private  String companyName;
    private int totalWage;
    private int workingHours;

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    private ArrayList<Integer> dailyEmployeeWage = new ArrayList<>();

    public ArrayList<Integer> getDailyEmployeeWage() {
        return dailyEmployeeWage;
    }

    public CompanyEmpWage() {
    }

    public CompanyEmpWage(int workingDaysPerMonth, int workingHoursPerMonth, int wagePerHour, String companyName) {
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.workingHoursPerMonth = workingHoursPerMonth;
        this.wagePerHour = wagePerHour;
        this.companyName = companyName;
    }
    public int getWorkingDaysPerMonth() {
        return workingDaysPerMonth;
    }

    public void setWorkingDaysPerMonth(int workingDaysPerMonth) {
        this.workingDaysPerMonth = workingDaysPerMonth;
    }

    public int getWorkingHoursPerMonth() {
        return workingHoursPerMonth;
    }

    public void setWorkingHoursPerMonth(int workingHoursPerMonth) {
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "workingDaysPerMonth=" + workingDaysPerMonth +
                ", workingHoursPerMonth=" + workingHoursPerMonth +
                ", wagePerHour=" + wagePerHour +
                ", companyName='" + companyName + '\'' +
                ", totalWage=" + totalWage +
                '}';
    }
}
