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
        long n = Long.parseLong(sc.nextLine());
        long gt = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            gt *= i;
            sum += gt;
        }
        System.out.println(sum);
    }
}
