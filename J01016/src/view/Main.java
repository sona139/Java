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
        char[] str = sc.nextLine().toCharArray();
        int cnt = 0;
        for (char i : str) {
            if (i == '4' || i == '7')
                cnt++;
        }
        System.out.println((cnt == 4 || cnt == 7) ? "YES" : "NO");
    }
}
