/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;

import java.math.BigInteger;

/**
 *
 * @author Admin
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci");
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        //
        //
        int count = 150;
        BigInteger arr[] = new BigInteger[count];
        arr[0] = first;
        arr[1] = second;
        
        for (int i = 2; i < count; i++) {
                BigInteger sum = first.add(second);
                arr[i] = sum;
                first = second;
                second = sum;
        }
        System.out.print("[");
        for(int i = count-1;i>=0;i--){
            if(i==0){
               System.out.print(arr[i].toString()); 
            }else{
                System.out.print(arr[i].toString()+", "); 
            }
            
        }
        System.out.print("]");
    }

    public static int Fibonnaci(BigInteger first, BigInteger second, int number) {
        if (number == 3) {
            BigInteger TEMP = first.add(second);
            System.out.print(TEMP);
            number--;
            return Fibonnaci(second, TEMP, number);
        }
        if (number > 2) {
            BigInteger TEMP = first.add(second);
            System.out.print(TEMP + ", ");
            number--;
            return Fibonnaci(second, TEMP, number);
        } else {
            return 0;
        }
    }

}
