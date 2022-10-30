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
        BigInteger a = new BigInteger(sc.next()), b = new BigInteger(sc.next());
        BigInteger gcd = a.gcd(b);
        a = a.divide(gcd);
        b = b.divide(gcd);
        System.out.println(a + "/" + b);
    }
}
