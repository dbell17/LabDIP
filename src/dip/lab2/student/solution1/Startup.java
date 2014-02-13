/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2.student.solution1;

import java.text.NumberFormat;

/**
 *
 * @author Don
 */
public class Startup {
    public static void main(String[] args) {
        
        TipCalculator tip1 = new BaggageServiceTipCalculator(ServiceQuality.GOOD, 5);
        TipCalculator tip2 = new FoodServiceTipCalculator(ServiceQuality.GOOD, 100);

        TipCalculator[] tips = {tip1, tip2};
        TipCalculatorService tcs = new TipCalculatorService();
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        
        for (int i = 0; i < tips.length; i++) {
            System.out.println("Total bill " + (i + 1) + " " + dollars.format(tcs.getTipForService(tips[i])));
        }

    }
    }

