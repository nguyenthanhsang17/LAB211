/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import Controller.CalculatorBMI;
import Controller.CalculatorNorMal;
import InputValidate.InputValidate;
import View.View;

/**
 *
 * @author Admin
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View view = new View();
        InputValidate input = new InputValidate();
        CalculatorNorMal calculatorNorMal = new CalculatorNorMal();
        CalculatorBMI calculatorBMI = new CalculatorBMI();
        int chooseOption = 0;
        do {
            view.PrintMenu();
            chooseOption = input.inputValueInt("Please choice one option:", 1, 3);
            switch (chooseOption) {
                case 1:
                    view.PrintCalculator();
                    calculatorNorMal.CalculatorNorMal();
                    break;

                case 2:
                    view.PrintBMI();
                    calculatorBMI.CalculatorBMI();
                    break;
            }
        } while (chooseOption != 3);
    }

}
