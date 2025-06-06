/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linnear_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Linnear_search {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enter search value
        int a = inputValueInt("Enter search value: ");
        // define array
        int[] array = new int[10];
        // use loop for to enter element of array
        for (int i = 0; i < 10; i++) {
            array[i] = inputValueInt("arr[" + i + "]: ");
        }
        // define list for remember position of value search in array
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (a == array[i]) {
                list.add(i);
            }
        }
        // print array
        System.out.print("The array: [");
        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
        //print the result 
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Found " + a + " at index: " + list.get(i));
        }
    }

    public static int inputValueInt(String msg) {
        // 
        String input;
        int result;
        do {
            // Print message for require user enter value 
            System.out.println(msg);
            // enter input value
            input = sc.nextLine();
            // .trim check space in head and last, check equals String empty
            if (input.trim().equals("")) {
                System.out.println("not input spacex");
                continue;
            }
            try {
                //parse String value to Double value
                double number = Double.parseDouble(input);
                // cast datatype 
                if (number == (int) number) {
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

}
