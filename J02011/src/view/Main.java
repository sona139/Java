/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i =0 ; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            int index = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[index])
                    index = j;
            }
            int t = a[i];
            a[i] = a[index];
            a[index] = t;
            System.out.format("Buoc %d:", i+1);
            for (int j : a) {
                System.out.print(" " + j);
            }
            System.out.println("");
        }
    }
}
