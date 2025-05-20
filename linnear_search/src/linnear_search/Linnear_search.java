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
        int a  = inputValueInt("Enter search value: ");
        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = inputValueInt("arr["+i+"]: ");
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(a==array[i]){
                list.add(i);
            }
        }
        System.out.print("The array: [");
        for (int i = 0; i < 10; i++) {
            if(i==9){
                System.out.print(array[i]);
            }else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("]");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Found "+a+" at index: "+list.get(i));
        }
    }
    
    public static int inputValueInt(String msg){
        // "                   "
        // "vu" => 
        //"2.3" = 2.3
        //"12"
        String input;
        int result ;
        do {            
            System.out.println(msg);
            input = sc.nextLine();
            // check spam spaces loix
            if(input.trim().equals("")){
                System.out.println("not input spacex");
                continue;
            }
            try {
                double number  = Double.parseDouble(input);
                 
                if(number==(int)number){
                    result = (int) number;
                    break;
                }else{
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
