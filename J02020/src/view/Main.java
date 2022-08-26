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
    static boolean ok = true;
    static int n, k, cnt;
    static int[] a;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = sc.nextInt();
        a = new int[k];
        cnt = 0;
        for (int i = 0; i < k; i++)
            a[i] = i+1;
        while(ok) {
            cnt++;
            for (int i : a)
                System.out.print(i + " ");
            System.out.println("");
            sinh();
        }
        System.out.format("Tong cong co %d to hop", cnt);
    }
    
    private static void sinh() {
        int i = k-1;
        while(i >= 0 && a[i] == n-k+i+1)
            i--;
        if (i == -1) {
            ok = false;
            return ;
        }
        else {
            a[i]++;
            for (int j = i+1; j < k; j++)
                a[j] = a[j-1]+1;
        }
    }
}