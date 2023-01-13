package com.bridglabz;

public class EmployeeWageMain {
    public static void main(String[] args) {
        CompanyEmpWage company1 = new CompanyEmpWage(27,500,100,"tata");
        CompanyEmpWage company2 = new CompanyEmpWage(26, 400, 100, "TCS");
        CompanyEmpWage company3 = new CompanyEmpWage(20, 40, 70, "Mahendra");
        CompanyEmpWage company4 = new CompanyEmpWage(20, 70, 70, "Infossys");
//TW;DW
        WageBuilder wageBuilder1 = new EmployeeWageBuilder();
        wageBuilder1.calculateWage(company1);
        EmployeeWageBuilder.companyEmpWageList.add(company1);
        System.out.println(EmployeeWageBuilder.getTotalWageByCompany(company1.getCompanyName()));
        System.out.println(EmployeeWageBuilder.getDailyWageByCompany(company1.getCompanyName()));


        WageBuilder wageBuilder2 = new EmployeeWageBuilder();
        EmployeeWageBuilder.companyEmpWageList.add(company2);
        wageBuilder2.calculateWage(company2);
        System.out.println(EmployeeWageBuilder.getTotalWageByCompany(company2.getCompanyName()));
        System.out.println(EmployeeWageBuilder.getDailyWageByCompany(company2.getCompanyName()));


        EmployeeWageBuilder.companyEmpWageList.add(company3);
        wageBuilder2.calculateWage(company3);
        System.out.println(EmployeeWageBuilder.getTotalWageByCompany(company3.getCompanyName()));
        System.out.println(EmployeeWageBuilder.getDailyWageByCompany(company3.getCompanyName()));


        EmployeeWageBuilder.companyEmpWageList.add(company4);
        wageBuilder2.calculateWage(company4);
        System.out.println(EmployeeWageBuilder.getTotalWageByCompany(company4.getCompanyName()));
        System.out.println(EmployeeWageBuilder.getDailyWageByCompany(company4.getCompanyName()));
    }
}
