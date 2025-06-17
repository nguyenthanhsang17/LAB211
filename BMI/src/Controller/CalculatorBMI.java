/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import InputValidate.InputValidate;

/**
 *
 * @author Admin
 */
public class CalculatorBMI {
    
    private final InputValidate inputValidate = new InputValidate();
    
    public void CalculatorBMI(){
        double weight = inputValidate.inputValueDouble("Enter Weight(kg): ", 0, Integer.MAX_VALUE);
        double height = inputValidate.inputValueDouble("Enter Height(cm): ", 0, Integer.MAX_VALUE);
        height = height/100;
        double BMI = weight/(Math.pow(height, 2));
        System.out.printf("BMI Number: %.2f\n", BMI);
        System.out.print("BMI Status: ");
        if(BMI<19){
            System.out.println("Under-standard");
        }else if(BMI<=25){
            System.out.println("Standard");
        }else if(BMI<=30){
            System.out.println("Overweight");
        }else if(BMI<=40){
            System.out.println("Fat - should lose weight");
        }else{
            System.out.println("Very fat - should lose weight immediately");
        }
    }
}
