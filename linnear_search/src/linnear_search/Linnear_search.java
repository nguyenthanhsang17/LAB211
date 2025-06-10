/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linnear_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        //enter number of array
        int number = inputValueInt("Enter number of array: ");
        //enter search value
        int value = inputValueInt("Enter search value: ");
        // define array
        int[] array = new int[number];
        Random random = new Random();
        // use loop for to enter element of array
        for (int i = 0; i < number; i++) {
            array[i] = random.nextInt(number);
        }
        // define list for remember position of value search in array
        List<Integer> list = new ArrayList<>();
        //
        for (int i = 0; i < number; i++) {
            if (value == array[i]) {
                list.add(i);
            }
        }
        // print array
        System.out.print("The array: [");
        for (int i = 0; i < number; i++) {
            //in ra so cuoi cung
            if (i == number - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("]");
        //print the result 
        //kiem tra list luu vi tri kia co phan tu nao ko
        if (list.isEmpty()) {
            System.out.println("Can't not found !!!!");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Found " + value + " at index: " + list.get(i));
            }
        }
    }

    public static int inputValueInt(String msg) {
        // 
        String input;
        int result;
        do {
            //Print message for require user enter value 
            System.out.println(msg);
            //enter input value
            input = sc.nextLine();
            // .trim check space on head and last, check equals String empty
            if (input.trim().equals("")) {
                System.out.println("not input space");
                continue;
            }
            try {
                //parse String value to Double value

                double number = Double.parseDouble(input);
                // cast datatype 
                //2.3 = > 2
                if (number == (int) number) {
                    result = (int) number;
                    break;
                    //
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
