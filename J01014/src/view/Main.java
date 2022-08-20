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
    private static long mdv = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            long n = Long.parseLong(sc.nextLine());
            mdv = 1;
            n = Div(n, 2);
            n = Div(n, 3);
            int i = 5;
            while (i <= Math.sqrt(n)) {
                n = Div(n, i);
                n = Div(n, i+2);
                i += 6;
            }
            if (mdv < n) mdv = n;
            System.out.println(mdv);
        }
    }
    private static long Div(long n, long div) {
        if (n%div != 0) return n;
        mdv = div;
        while(n%div == 0)
            n /= div;
        return n;
    }
}
