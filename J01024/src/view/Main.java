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
            System.out.println(tenary(sc.nextLine()));
        }
    }
    
    private static String tenary(String s) {
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character != '0' && character != '1' && character != '2')
                return "NO";
        }
        return "YES";
    }
}
