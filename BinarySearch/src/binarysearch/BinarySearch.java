/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
        //int [] array = new int[numberOfArray];
        int [] array = {6, 0, 0, 8, 8, 9, 5, 8, 1, 8};
        
        // 1, 3, 4, 5, 6, 6, 6, 6, 8, 9
//        for (int i = 0; i < numberOfArray; i++) {
//            array[i] = random.nextInt(numberOfArray); 
//        }
        int [] arrayAfterSort = sortArray(array);
        System.out.print("The array: [");
        for (int i = 0; i < numberOfArray; i++) {
            if(i==numberOfArray-1){
                System.out.print(arrayAfterSort[i]);
                continue;
            }
            System.out.print(arrayAfterSort[i]+",");
        }
        System.out.println("]");
        int value = inputValueInt("Enter search value: ");
        int start_index=0;
        int end_index = numberOfArray-1;
        int find_index = -1;
        //start_index>end_index
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
        
        
        if(find_index ==-1){
            System.out.println("ko tim thay");
        }else{
            List<Integer> positions = new ArrayList<>();
            positions.add(find_index);
            
            
            
            for(int i = find_index+1;i<numberOfArray;i++){
                if(arrayAfterSort[i]==value){
                    positions.add(i);
                }else{
                    break;
                }
            }
            for(int i = find_index-1;i>=0;i--){
                if(arrayAfterSort[i]==value){
                    positions.add(i);
                }else{
                    break;
                }
            }
            Comparator comparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            };
            Collections.sort(positions, comparator);
            //System.out.println("Found "+value+" at index:  "+find_index);
            for (Integer position : positions) {
               System.out.println("Found "+value+" at index:  "+position); 
            }
            
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
