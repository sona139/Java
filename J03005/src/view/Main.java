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
        while(t-- > 0 ) {
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s+");
            StringBuilder res = new StringBuilder();
            for (int i = 1; i < s.length; i++) {
                char[] word = s[i].toCharArray();
                word[0] = Character.toUpperCase(word[0]);
                res.append(new String(word));
                res.append(' ');
            }
            System.out.println(res.toString().trim() + ", " + s[0].toUpperCase());
        }
    }
}
