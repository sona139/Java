/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), h = sc.nextInt();
            DecimalFormat f = new DecimalFormat("##.000000");
            for (int i = 1; i < n; i++) {
                System.out.print(f.format(h*Math.sqrt((double)i/n)) + " ");
            }
            System.out.println("");
        }
    }
}
