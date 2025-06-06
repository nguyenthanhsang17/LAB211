/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changebasenumber;

import Controller.ChangeBase;
import Controller.Input;
import View.View;

/**
 *
 * @author Admin
 */
public class ChangeBaseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View view = new View();
        Input input = new Input();
        ChangeBase base = new ChangeBase();
        while (true) {
            int option = input.inputValueInt("Choose the base number input (1 is binary, 2 is decimal,  3 is hexadecimal)", 1, 3);
            String value = input.InputValue("Enter Value: ", option);
            int option_2 = input.inputValueInt("Choose the base number input (1 is binary, 2 is decimal,  3 is hexadecimal)", 1, 3);
            if (option == option_2) {
                System.out.println("ko dc phep giong nhau");
            } else {
                String result = "";
                if (option == 1) {
                    if (option_2 == 2) {
                        result = base.BinaryToDecimal(value);
                    } else {
                        result = base.BinaryToHex(value);
                    }
                }
                if (option == 2) {
                    if (option_2 == 1) {
                        result = base.DecimalToBinary(value);
                    } else {
                        result = base.DecimalToHexDecimal(value);
                    }
                }
                if (option == 3) {
                    if (option_2 == 2) {
                        result = base.HexDecimalToDecimal(value);
                    } else {
                        result = base.HEXtoBinary(value);
                    }
                }
                System.out.println("result: "+result);
            }
        }
    }

}
