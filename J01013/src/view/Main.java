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
        long res = 0;
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            res += Sum(Integer.parseInt(sc.nextLine()));
        }
        System.out.println(res);
    }
    
    private static int Sum(int n) {
        int s = 0;
        while(n%2 == 0) {
            s += 2;
            n /= 2;
        }
        while(n%3 == 0) {
            s += 3;
            n /= 3;
        }
        int i = 5;
        while (i <= Math.sqrt(n)) {
            while(n%i == 0) {
                s += i;
                n /= i;
            }
            while(n%(i+2) == 0) {
                s += i+2;
                n /= (i+2);
            }
            i += 6;
        }
        if (n > 1) s += n;
        return s;
    }
}
