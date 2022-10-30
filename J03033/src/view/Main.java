/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.math.BigInteger;
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
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            BigInteger gcd = a.gcd(b);
            BigInteger res = a.multiply(b).divide(gcd);
            System.out.println(res);
        }
    }
}
