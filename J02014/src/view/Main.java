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
            int a[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; ++i) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int suml = 0, sumr = sum-a[0];
            int res = -1;
            for (int i = 1; i < n; i++) {
                suml += a[i-1];
                sumr -= a[i];
                if (suml == sumr) {
                    res = i+1;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
