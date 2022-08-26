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
        for (int i = 1; i <= n; i++) {
            System.out.format("List(%d) = ", i);
            for (int j = 1; j <= n; j++) {
                if(sc.nextInt() == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}