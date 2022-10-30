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
            String[] s = sc.nextLine().split("\\s+");
            int cnt = 0;
            for (String i : s) {
                if(Character.getNumericValue(i.charAt(i.length()-1))%2 == 0)
                    cnt++;
            }
            System.out.println((s.length%2 == 0 && cnt > s.length/2 || s.length%2 == 1 && cnt <= s.length/2) ? "YES" : "NO");
        }
    }
}
