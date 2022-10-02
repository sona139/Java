/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
//        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt()-1;
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                    a[i][j] = sc.nextInt();
            for (int i = 0; i < n; i++)
                for (int j = i+1; j < n; j++) {
                    if(a[j][k] < a[i][k]) {
                        int tmp = a[j][k];
                        a[j][k] = a[i][k];
                        a[i][k] = tmp;
                    }
                }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println("");
            }
        }
    }
}
