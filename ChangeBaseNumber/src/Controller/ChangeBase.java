/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.math.BigInteger;

/**
 *
 * @author Admin
 */
public class ChangeBase {
    public String DecimalToBinary(String valueDecimal){
        BigInteger integer = new BigInteger(valueDecimal);
        BigInteger binary = new BigInteger("2");
        StringBuilder result = new StringBuilder("");
        while (true) {            
            BigInteger r = integer.remainder(binary);
            integer = integer.divide(binary);
            result.append(r.toString());
            //892742734 => "892742734"
            if(integer.equals(new BigInteger("0"))){
                break;
            }
        }
//        String  a ="sang";
//        String b = a.concat("hung");
//        //b = "sanghung"
//        result.reverse();
//        
        
        return  result.reverse().toString();
    }
    
    
    
    public String BinaryToDecimal(String valueBinary){
        int length = valueBinary.length();
        BigInteger binary = new BigInteger("2");
        BigInteger sum = new BigInteger("0"); //== 0
        for (int i = 0; i < length; i++) {
            int mu = length-(i+1);
            char a  = valueBinary.charAt(i);
            BigInteger b = new BigInteger(a+"");
            ///===============================
            BigInteger e = b.multiply(binary.pow(mu));
            sum = sum.add(e);
        }
        return  sum.toString();
    }
}
