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

    public String DecimalToBinary(String valueDecimal) {
        BigInteger integer = new BigInteger(valueDecimal);
        BigInteger binary = new BigInteger("2");
        StringBuilder result = new StringBuilder("");
        while (true) {
            BigInteger r = integer.remainder(binary);
            integer = integer.divide(binary);
            result.append(r.toString());
            //892742734 => "892742734"
            if (integer.equals(new BigInteger("0"))) {
                break;
            }
        }
//        String  a ="sang";
//        String b = a.concat("hung");
//        //b = "sanghung"
//        result.reverse();
//        

        return result.reverse().toString();
    }

    public String BinaryToDecimal(String valueBinary) {
        int length = valueBinary.length();
        BigInteger binary = new BigInteger("2");
        BigInteger sum = new BigInteger("0"); //== 0
        for (int i = 0; i < length; i++) {
            int mu = length - (i + 1);
            char a = valueBinary.charAt(i);
            BigInteger b = new BigInteger(a + "");
            ///===============================
            BigInteger e = b.multiply(binary.pow(mu));
            sum = sum.add(e);
        }
        return sum.toString();
    }

    private String ConvertNumberToChar(String number) {
        String result = "";
        switch (number) {
            case "10":
                result = "A";
                break;
            case "11":
                result = "B";
                break;
            case "12":
                result = "C";
                break;
            case "13":
                result = "D";
                break;
            case "14":
                result = "E";
                break;
            case "15":
                result = "F";
                break;

            default:
                throw new AssertionError();
        }
        return result;
    }
    //numnber = 8
    //number = 14
    //number =
    private String ConvertNumberToChar_2(String number) {
        int index = Integer.parseInt(number);
        String hex = "0123456789ABCDEF";
        return hex.charAt(index)+"";
    }
    public String DecimalToHexDecimal(String valueDecimal) {
        BigInteger integer = new BigInteger(valueDecimal);
        BigInteger HEX = new BigInteger("16");
        StringBuilder result = new StringBuilder("");
        while (true) {
            BigInteger r = integer.remainder(HEX);
            integer = integer.divide(HEX);
//            String remainder_Str ="";
//            if(r.compareTo(new BigInteger("9"))>=1){
//                remainder_Str = ConvertNumberToChar(r.toString());
//            }else{
//                remainder_Str = r.toString();
//            }
            //result.append(remainder_Str);
            
            result.append(ConvertNumberToChar_2(r.toString()));
            //892742734 => "892742734"
            if (integer.equals(new BigInteger("0"))) {
                break;
            }
        }
//        String  a ="sang";
//        String b = a.concat("hung");
//        //b = "sanghung"
//        result.reverse();
//        
        return result.reverse().toString();
    }
    
    
    private int ConvertCharToNumber_2(String c) {
        String hex = "0123456789ABCDEF";
        return hex.indexOf(c);
    }
    
    public String HexDecimalToDecimal(String valuehex){
        //1D4C0
        int length = valuehex.length();
        BigInteger hex = new BigInteger("16");
        BigInteger sum = new BigInteger("0"); //== 0
        for (int i = 0; i < length; i++) {
            int mu = length - (i + 1);
            char a = valuehex.charAt(i);
            
            int number = ConvertCharToNumber_2(a+"");
            
            BigInteger b = new BigInteger(number + "");//"1"
            ///===============================
            BigInteger e = b.multiply(hex.pow(mu));
            sum = sum.add(e);
        }
        return sum.toString();
    }
    
    public String BinaryToHex(String value_Binary){
        String decimal = BinaryToDecimal(value_Binary);
        String HEX = DecimalToHexDecimal(decimal);
        return HEX;
    }
    public String HEXtoBinary(String value_HEX){
        String decimal = HexDecimalToDecimal(value_HEX);
        String Binary = DecimalToBinary(decimal);
        return Binary;
    }
}
