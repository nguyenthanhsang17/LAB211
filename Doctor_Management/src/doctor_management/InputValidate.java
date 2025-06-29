/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor_management;

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

    public String inputValue(String msg) {
        String input;
        do {
            System.out.print(msg);
            input = sc.nextLine();
            if (input.trim().equals("")) {
                System.out.println("Not input spacex");
                continue;
            } else {
                break;
            }
        } while (true);

        return input.trim();
    }

    public String inputValueAllowNull(String msg) {
        String input;
        System.out.print(msg);
        input = sc.nextLine();
        return input.trim();
    }

    public double inputValueDouble(String msg, int min) {
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
                if (min < number) {
                    return number;
                } else {
                    System.out.println("must be input real number greater than zero");
                }
            } catch (Exception e) {
                System.out.println("BMI is digit");
            }

        } while (true);
    }

}
