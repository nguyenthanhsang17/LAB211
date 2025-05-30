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
        int option = input.inputValueInt("Choose the base number input (1 is binary, 2 is decimal,  3 is hexadecimal)", 1, 3);
        String value = input.InputValue("Enter Value: ", option);
        
        System.out.println(base.BinaryToDecimal(value));
    }
    
}
