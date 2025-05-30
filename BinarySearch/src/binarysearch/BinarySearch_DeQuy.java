/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import static binarysearch.BinarySearch.inputValueInt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BinarySearch_DeQuy {
    
    private final static Scanner sc =  new Scanner(System.in);
    
    public static void main(String[] args) {
        Random random = new Random();
        //int numberOfArray = inputValueInt("Enter number of array: ");
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int value = inputValueInt("Enter search value: ");
//        for (int i = 0; i < numberOfArray; i++) {
//            //array[i] = inputValueInt("arr["+i+"]: ");
//            array[i] = random.nextInt(numberOfArray);
//        }
    int value =1;

        int index = BinarySearch(array, 0, 9, value);
        System.out.println(index);

        
    }
    
    private static int BinarySearch(int arr[], int start_index, int end_index, int value){
        
        int midle_index = (start_index+end_index)/2;
        if(start_index>end_index){
            return -1;
        }
        if(arr[midle_index]==value){
            return midle_index;
        }else if(arr[midle_index]>value){
            return  BinarySearch(arr, start_index, midle_index-1, value);
        }else{
            
            return  BinarySearch(arr, midle_index+1, end_index, value);
        }
        
    }
    
    
    public static String inputValue(String msg) {
        String input;
        do {
            System.out.println(msg);
            input = sc.nextLine();
            // check spam spaces loix
            if (input.trim().equals("")) {
                System.out.println("Not input spacex");
                continue;
            } else {
                break;
            }
        } while (true);

        return input;
    }

    public static int inputValueInt(String msg) {
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
