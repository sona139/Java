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
        int[][] a = new int[n][3];
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1) cnt++;
            }
            if (cnt > 1) res++;
        }
        System.out.println(res);
    }
}
