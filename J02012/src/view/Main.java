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
        for (int i = 0; i < n; i++) {
            int key = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            System.out.format("Buoc %d:", i);
            for (int k = 0; k <= i; k++)
                System.out.print(" " + a[k]);
            System.out.println("");
        }
    }
}
