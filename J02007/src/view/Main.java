/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int T = 1; T <= t; T++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int m[] = new int[100001];
            Arrays.fill(m, 0);
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
                m[a[i]]++;
            }
            System.out.format("Test %d:\n", T);
            for (int i : a)
                if (m[i] != 0) {
                    System.out.format("%d xuat hien %d lan\n", i, m[i]);
                    m[i] = 0;
                }
        }
    }
}
