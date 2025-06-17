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
public class CalculatorNorMal {

    private final InputValidate inputValidate = new InputValidate();

    public void CalculatorNorMal() {
        double number1 = inputValidate.inputValueDouble_2("Enter number: ");
        String operator = "";
        double memory = number1;
        do {
            operator = inputValidate.inputValueOperator("Enter Operator: ");
            if(operator.equals("=")){
                System.out.println("Result: "+memory);
                break;
            }
            double number2;
            if (operator.equals("/")) {
                do {
                    number2 = inputValidate.inputValueDouble_2("Enter number: ");
                    if (number2 == 0) {
                        System.out.println("Ko the cho zero");
                        continue;
                    }else{
                        break;
                    }
                } while (true);
            } else {
                number2 = inputValidate.inputValueDouble_2("Enter number: ");
            }
            switch (operator) {
                case "+":
                    memory = memory + number2;
                    break;
                case "-":
                    memory = memory - number2;
                    break;
                case "*":
                    memory = memory * number2;
                    break;
                case "/":
                    memory = memory / number2;
                    break;
                case "^":
                    memory = Math.pow(memory, number2);
                    break;
            }
            System.out.println("Memory:"+memory);
        } while (!operator.equals("="));
    }
}
