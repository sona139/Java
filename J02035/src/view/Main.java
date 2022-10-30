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
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long Min = 100000;
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextLong();
                Min = Long.min(Min, a[i]);
            }
            int i = 0;
            while(a[i] != Min)
                i++;
            System.out.println(i);
        }
    }
}
