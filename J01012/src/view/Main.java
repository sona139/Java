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
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(count(n));
        }
    }
    
    private static int count(int n) {
        int cnt = 0, sqr = (int) Math.sqrt(n);
        for (int i = 1; i <= sqr; i++) {
            if (n%i == 0) {
                if (i%2 == 0) cnt++;
                if ((n/i)%2 == 0) cnt++;
            }
        }
        if (sqr*sqr == n && sqr%2 == 0) cnt--;
        return cnt;
    }
}
