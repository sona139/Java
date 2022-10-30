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
            System.out.println(perfect2(sc.nextLine().toCharArray()));
        }
    }
    
    private static String perfect2(char[] s) {
        int sum = 0, l = s.length;
        if(s[0] != '8') {
            return "NO";
        }
        for (int i = 0; i < l/2; i++) {
            if (s[i] != s[l-i-1]) {
                return "NO";
            }
            sum += Character.getNumericValue(s[i])*2;
        }
        return (sum%10 == 0) ? "YES" : "NO";
    }
}
