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
        int T = Integer.parseInt(sc.nextLine());
        for (int t = 1; t <= T; t++){
            int n = Integer.parseInt(sc.nextLine());
            System.out.print("Test " + t + ": ");
            int i = 2;
            while(i <= Math.sqrt(n)) {
                if(n%i == 0) {
                    int cnt = 0;
                    while(n%i == 0) {
                        n /= i;
                        ++cnt;
                    }
                    System.out.print(i + "(" + cnt + ") ");
                }
                i++;
            }
            if(n > 1) {
                System.out.print(n + "(1)");
            }
            System.out.println("");
        }
    }
}
