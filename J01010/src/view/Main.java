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
    static Scanner sc = new Scanner(System.in);
    private static StringBuffer Div = new StringBuffer("0122222200");
    private static StringBuffer s = new StringBuffer();
    
    private static boolean Cut() {
        int countZero = 0;
        for (int i = 0; i < s.length(); i++) {
            s.setCharAt(i, Div.charAt(Character.getNumericValue(s.charAt(i))));
            if (s.charAt(i) == '2') {
                s = new StringBuffer("INVALID");
                return false;
            }
            if (s.charAt(i) == '0') {
                countZero++;
            }
        }
        if (countZero == s.length()) {
            s = new StringBuffer("INVALID");
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0)  {
            s = new StringBuffer(sc.nextLine());
            if(Cut()) {
                System.out.println(Long.parseLong(new String(s)));
            }
            else {
                System.out.println(s);
            }
        }
    }
}
