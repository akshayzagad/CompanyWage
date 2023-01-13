package com.bridglabz;

public interface WageBuilder {
    int calculateWage(CompanyEmpWage companyEmpWage);
    int calculateDailyWage(CompanyEmpWage companyEmpWage,int workingHours);
    int Full_Time_Hour = 8;
    int Part_Time_Hour = 4;
    int Is_Part_Time_Hour = 1;
    int Is_Full_Time_Hour = 2;

}
