/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputValidate;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class InputValidate {

    private static final Scanner sc = new Scanner(System.in);

    public int inputValueInt(String msg, int min, int max) {
        String input;
        int result;
        do {
            System.out.print(msg);
            input = sc.nextLine();
            if (input.trim().equals("")) {
                System.out.println("not input spacex");
                continue;
            }
            try {
                double number = Double.parseDouble(input);

                if (number == (int) number) {
                    if (number < min || number > max) {
                        System.out.println("Out Range [" + min + "-" + max + "]");
                        continue;
                    }
                    result = (int) number;
                    break;
                } else {
                    System.out.println("not input real number");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("must be input integer number !!!!!!");
            }

        } while (true);
        return result;
    }

    public double inputValueDouble(String msg, double min, double max) {
        String input;
        do {
            System.out.print(msg);
            input = sc.nextLine();
            if (input.trim().equals("")) {
                System.out.println("not input space");
                continue;
            }
            try {
                double number = Double.parseDouble(input);
                if (min <= number && number <= max) {
                    return number;
                } else {
                    System.out.println("must be input real number in range [" + min + "-" + max + "]");
                }
            } catch (Exception e) {
                System.out.println("BMI is digit");
            }

        } while (true);
    }

    public double inputValueDouble_2(String msg) {
        String input;
        do {
            System.out.print(msg);
            input = sc.nextLine();
            if (input.trim().equals("")) {
                System.out.println("not input space");
                continue;
            }
            try {
                double number = Double.parseDouble(input);
                return number;
            } catch (Exception e) {
                System.out.println("must be input real number !!!!!!");
            }

        } while (true);
    }
    
    
    public String inputValueOperator(String msg) {
        String input;
        String validate = "+-*/^=";
        do {
            System.out.print(msg);
            input = sc.nextLine();
            if (input.trim().equals("")) {
                System.out.println("not input space");
                continue;
            }
            if(input.length()>1){
                System.out.println("pPlease input (+,-, *, /, ^)");
                continue;
            }
            // "hungvu"
            // "gv"   "hungvu".contain("ngv") => true
            // *
            if(!validate.contains(input)){
                System.out.println("pPlease input (+,-, *, /, ^)");
                continue;
            }
            return input;
        } while (true);
    }
}
