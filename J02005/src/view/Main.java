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
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] ma = new int[1000];
        Arrays.fill(ma, 0);
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ma[a[i]] = 1;
        }
        int[] res = new int[1000];
        int sz = 0;
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if (ma[num] > 0) {
                res[sz] = num;
                sz++;
                ma[num] = 0;
            }
        }
        Arrays.sort(res);
        for (int i : res)
            if (i != 0)
                System.out.print(i + " ");
    }
}
