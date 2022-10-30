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
            long a = sc.nextLong(), b = sc.nextLong();
            BigInteger b1 = BigInteger.valueOf(a);
            BigInteger b2 = BigInteger.valueOf(b);
            BigInteger gcd = b1.gcd(b2);
            BigInteger lcm = b1.multiply(b2).divide(gcd);
            System.out.println(lcm.longValue() + " " + gcd.longValue());
        }
    }
}
