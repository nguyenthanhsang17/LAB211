/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfArray = inputValueInt("Enter number of array: ");
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = inputValueInt("Enter search value: ");
//        for (int i = 0; i < numberOfArray; i++) {
//            //array[i] = inputValueInt("arr["+i+"]: ");
//            array[i] = random.nextInt(numberOfArray);
//        }
        int [] arrayAfterSort = sortArray(array);
        
        int start_index=0;
        int end_index = numberOfArray-1;
        int find_index = -1;
        
        while (start_index<=end_index) {  
            int midle_index = (start_index+end_index)/2;
            if(arrayAfterSort[midle_index]==value){
                find_index = midle_index;
                break;
            } else
            if(arrayAfterSort[midle_index]>value){
                end_index = midle_index-1;
            }
            if(arrayAfterSort[midle_index]<value){
                start_index = midle_index+1;
            }
        }
        System.out.print("The array: [");
        for (int i = 0; i < numberOfArray; i++) {
            if(i==numberOfArray-1){
                System.out.print(arrayAfterSort[i]);
                continue;
            }
            System.out.print(arrayAfterSort[i]+",");
        }
        System.out.println("]");
        
        if(find_index ==-1){
            System.out.println("ko tim thay");
        }else{
            System.out.println("Found "+value+" at index:  "+find_index);
        }
        
    }
    public static int[] sortArray(int [] array){
        int length = array.length;
        for(int i = 0;i<length;i++){
            for (int j = 0; j < length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
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
