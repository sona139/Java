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
     static String isprime(int n) {
        if (n < 2) return "NO";
        for (int i = 2; i <= Math.sqrt(n); i++)
            if(n%i == 0)
                return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
            System.out.println(isprime(sc.nextInt()));
    }
}
