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
        int n = sc.nextInt();
        int numMax = 0;
        int[] a = new int[n], m = new int[205];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
            m[a[i]] = 1;
            numMax = Integer.max(numMax, a[i]);
        }
        boolean ok = true;
        for (int i = 1; i <= numMax; i++) {
            if(m[i] == 0) {
                System.out.println(i);
                ok = false;
            }
        }
        if (ok) System.out.println("Excellent!");
    }
}
