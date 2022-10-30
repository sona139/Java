/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author hongs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static TreeSet<String> set;
    static int n = 0, k = 0;
    static int[] a;
    static int[] bin;
    static boolean ok;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int [n];
            bin = new int[k];
            ok = true;
            for (int i = 0; i < k; i++)
                bin[i] = i;
            for (int i = 0; i < n; i++)
                 a[i] = sc.nextInt();
            Arrays.sort(a);
            while(ok) {
                solve();
                sinh();
            }
        }
    }
    
    public static void sinh() {
        int i = k-1;
        while(i >= 0 && bin[i] == n-k+i) --i;
        if(i == -1) {
            ok = false;
            return ;
        }
        bin[i]++;
        for (int j = i+1; j < k; j++)
            bin[j] = bin[j-1]+1;
    }
    
    public static void solve() {
        int i = 1;
        while(i < k) {
            if(a[bin[i]] < a[bin[i-1]])
                return ;
            i++;
        }
        for (i = 0; i < k; i++)
            System.out.print(a[bin[i]] + " ");
        System.out.println("");
    }
    
}
