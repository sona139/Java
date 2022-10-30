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
    private static final int Mod = (int) (1e9+7);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a+b == 0) break;
            System.out.println(Pow(a, b));
        }
    }
    
    private static long Pow(long a, long b) {
        if (b == 0) return 1;
        long Pow50 = Pow(a, b/2);
        if(b%2 == 0) return Pow50%Mod*Pow50%Mod;
        return Pow50%Mod*Pow50%Mod*a%Mod;
    }
}
