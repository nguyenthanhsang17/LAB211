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

        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<Character, Integer> hashMap1 = new HashMap<>();

        input = input.trim();
        //hung vu sang
        //{"hung","vu", "sang" , "", ""}
        String word[] = input.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (!word[i].equals("") && !word[i].isEmpty()) {
                if (hashMap.containsKey(word[i])) {
                    int count = hashMap.get(word[i]);
                    count++;
                    hashMap.put(word[i], count);
                } else {
                    hashMap.put(word[i], 1);
                }
            } 
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                char hung = input.charAt(i);
                if (hashMap1.containsKey(hung)) {
                    int count = hashMap1.get(hung);
                    count++;
                    hashMap1.put(hung, count);
                } else {
                    hashMap1.put(hung, 1);
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
            if (input.trim().equals("")) {
                System.out.println("Not input spacex");
                continue;
            } else {
                break;
            }
        } while (true);

        return input;
    }

}
