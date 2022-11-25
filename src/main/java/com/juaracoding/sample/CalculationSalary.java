package com.juaracoding.sample;

public class CalculationSalary {
    
    double calculateTax(Employee employee) {
        double resultSalary = 0;
        
        if(employee.getSalary() > 7000){
            double resultTax = employee.getSalary() * employee.getTax()/100;
            resultSalary = employee.getSalary() - resultTax;
        } else {
            resultSalary = employee.getSalary();
        }
        
        return resultSalary;
    }
    
}
