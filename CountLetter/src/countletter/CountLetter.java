/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countletter;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CountLetter {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = inputValue("Enter your content:");
        // hash key value
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        //hung vu sang hung   vu
        //{"hung", "vu", "sang", "hung","","","vu"}
        String word[] = input.split(" ");
        // for de duyet phan tu mang word
        for (int i = 0; i < word.length; i++) {
            // check 
            if (!word[i].equals("") && !word[i].isEmpty()) {
                //hashmap {hung, 1} {vu, 2}, {sang, 1}
                //hung
                //{hung, 1}
                //count  = 2;{hung, 1000}
                if (hashMap.containsKey(word[i])) {
                    int count = hashMap.get(word[i]);
                    count++;
                    hashMap.put(word[i], count);
                } else {
                    hashMap.put(word[i], 1);
                }
            } 
        }
        //hung vu   sang hung hung
        // duyet tung ky tu trong mang
        for (int i = 0; i < input.length(); i++) {
            
            if (input.charAt(i) != ' ') {
                char kytu = input.charAt(i);
                if (hashMap1.containsKey(kytu)) {
                    int count = hashMap1.get(kytu);//{h, 1} // 1
                    count++;
                    hashMap1.put(kytu, count);
                }else {
                    hashMap1.put(kytu, 1);
                }
            }
        }

        System.out.println(hashMap);
        System.out.println(hashMap1);
    }

    public static String inputValue(String msg) {
        String input;
        do {
            System.out.println(msg);
            input = sc.nextLine();
            // check spam spaces loix
            // "v   u"
            if (input.trim().equals("")) {
                System.out.println("Not input spacex");
                continue;
            } else {
                break;
            }
        } while (true);

        return input.trim();
    }

}
