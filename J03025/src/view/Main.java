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
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            System.out.println(solve());
        }
    }
    
    private static String solve() {
        char[] s = sc.nextLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < s.length/2; i++) {
            if (s[i] != s[s.length-i-1])
                cnt++;
            if (cnt > 1) return "NO";
        }
        return (s.length%2 == 0 && cnt == 1 || s.length%2 == 1) ? "YES" : "NO";
    }
}
