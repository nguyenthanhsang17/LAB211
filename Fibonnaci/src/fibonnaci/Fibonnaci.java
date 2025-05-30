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
        System.out.print("0, 1, ");
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        Fibonnaci(first, second, 100);
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
