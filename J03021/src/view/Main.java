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
            String s = sc.nextLine().toUpperCase();
            String res = phone(s);
            System.out.println(reversible(res));
        }
    }
    
    public static String reversible(String s) {
        for (int i = 0; i < s.length()/2; i++)
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return "NO";
        return "YES";
    }
    
    public static String phone(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++)
            res += trans(s.charAt(i));
        return res;
    }
    
    public static char trans(char c) {
        if(c <= 'C') return '2';
        if(c <= 'F') return '3';
        if(c <= 'I') return '4';
        if(c <= 'L') return '5';
        if(c <= 'O') return '6';
        if(c <= 'S') return '7';
        if(c <= 'V') return '8';
        return '9';
    }
}
