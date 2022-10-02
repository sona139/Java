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
            String s1 = sc.nextLine(), s2 = sc.nextLine();
            System.out.println(s1.equals(s2) ? -1 : Math.max(s1.length(), s2.length()));
        }
    }
}
