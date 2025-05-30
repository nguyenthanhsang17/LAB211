/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Input {

    private static final Scanner sc = new Scanner(System.in);

    public int inputValueInt(String msg, int min, int max) {
        // "                   "
        // "vu" => 
        //"2.3" = 2.3
        //"12"
        String input;
        int result;
        do {
            System.out.println(msg);
            input = sc.nextLine();
            // check spam spaces loix
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

    public String InputValue(String msg, int base) {
        String result = "";
        String input;
        switch (base) {
            case 1:
                do {
                    System.out.println(msg);
                    input = sc.nextLine();
                    // check spam spaces loix
                    if (input.trim().equals("")) {
                        System.out.println("not input spacex");
                        continue;
                    }
                    //102301230123012301023
                    if (input.matches("^[01]+$")) {
                        result = input;
                        break;
                    } else {
                        System.out.println("Erorr !!!!!!");
                        continue;
                    }

//                    boolean check = true;
//                    for(int i=0;i<input.length();i++){
//                        if(input.charAt(i)=='0'||input.charAt(i)=='1'){
//                            //010101012
//                        }else{
//                            check = false;
//                            break;
//                        }
//                    }
//                    if(check==false){
//                        System.out.println("Erorr !!!!!!");
//                        continue;
//                    }else{
//                        result = input;
//                        break;
//                    }
                } while (true);
                break;
            case 2:
                do {
                    System.out.println(msg);
                    input = sc.nextLine();
                    // check spam spaces loix
                    if (input.trim().equals("")) {
                        System.out.println("not input spacex");
                        continue;
                    }
                    boolean check = true;
                    for (int i = 0; i < input.length(); i++) {
                        char a = input.charAt(i);
                        if (Character.isDigit(a)) {

                        } else {
                            check = false;
                            break;
                        }
                    }
                    if (check == false) {
                        System.out.println("Erorr !!!!!!");
                        continue;
                    } else {
                        result = input;
                        break;
                    }

                } while (true);
                break;
            case 3:
                String hexString = "ABCDEF0123456789";
                do {
                    System.out.println(msg);
                    input = sc.nextLine();
                    // check spam spaces loix
                    if (input.trim().equals("")) {
                        System.out.println("not input spacex");
                        continue;
                    }
                    boolean check = true;
                    for (int i = 0; i < input.length(); i++) {
                        char a = input.charAt(i);
                        if (hexString.contains(a + "")) {
                            //AB9939123
                            //A char -> A String
                            // ABCDEF0123456789.contain("9") => true
                            //HUNGVU.contain("VU") => true
                        } else {
                            check = false;
                            break;
                        }
                    }
                    if (check == false) {
                        System.out.println("Erorr !!!!!!");
                        continue;
                    } else {
                        result = input;
                        break;
                    }

                } while (true);
                break;
        }
        return result;
    }

}
