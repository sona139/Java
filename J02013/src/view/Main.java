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
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            boolean haveSwap = false;
            for (int j = 0; j < n-i-1; j++)
                if(a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    haveSwap = true;
                }
            if (!haveSwap)
                break;
            System.out.format("Buoc %d:", i+1);
            for (int k : a) {
                System.out.print(" " + k);
            }
            System.out.println("");
        }
    }
}
