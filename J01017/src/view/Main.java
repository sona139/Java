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
            String str = sc.nextLine();
            String res = "YES";
            for (int i = 1; i < str.length(); i++) {
                if (Math.abs(Character.getNumericValue(str.charAt(i)) - Character.getNumericValue(str.charAt(i-1))) != 1) {
                    res = "NO";
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
