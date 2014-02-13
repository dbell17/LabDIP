/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

import java.text.NumberFormat;

/**
 *
 * @author Don
 */
public class StartUp {

    public static void main(String[] args) {
        
        Employee emp1 = new HourlyPlusBonusEmployee(15.00, 2000);
        Employee emp2 = new SalariedEmployee(53000, 1250);
        Employee emp3 = new SalariedEmployee(90000, 10000);
        Employee emp4 = new HourlyEmployee(20.00, 2900
        );


        HRService hr = new HRService();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        System.out.println("Employee 1 annual compensation: "
                + nf.format(hr.getAnnualCompensationForEmployee(emp1)));
        System.out.println("Employee 2 annual compensation: "
                + nf.format(hr.getAnnualCompensationForEmployee(emp2)));
        System.out.println("Employee 3 annual compensation: "
                + nf.format(hr.getAnnualCompensationForEmployee(emp3)));

    }

}

