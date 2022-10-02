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
        int Case = 1;
        while(t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            System.out.println("Test " + Case + ":");
            Mul(a, b, n, m);
            Case++;
        }
    }
    
    public static void Mul(int[][] a, int[][] b, int n, int m) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(res[i], 0);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < m; k++)
                    res[i][j] += a[i][k]*b[k][j];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(res[i][j] + " ");
            System.out.println("");
        }
    }
}
