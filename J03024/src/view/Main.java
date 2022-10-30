/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            System.out.println(inValid(sc.nextLine().toCharArray()));
        }   
    }
    
    private static String inValid(char[] s) {
        int dc = 0;
        for (char i : s) {
            if(Character.isAlphabetic(i)) {
                return "INVALID";
            }
            if(Character.getNumericValue(i)%2 == 0) {
                dc++;
            }
        }
        if(s.length%2 == 1 && s.length-dc > dc || s.length%2 == 0 && s.length-dc < dc) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
