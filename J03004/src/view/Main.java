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
            for (String item : s) {
                char[] word = item.toCharArray();
                word[0] = Character.toUpperCase(word[0]);
                res.append(new String(word));
                res.append(' ');
            }
            System.out.println(res.toString().trim());
        }
    }
}
