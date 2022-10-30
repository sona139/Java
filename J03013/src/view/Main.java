/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
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
            String s1 = sc.next();
            String s2 = sc.next();
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            BigInteger res = a.subtract(b).abs();
            int maxLen = Integer.max(s1.length(), s2.length());
            char[] zeros = new char[maxLen];
            Arrays.fill(zeros, '0');
            DecimalFormat df = new DecimalFormat(String.valueOf(zeros));
            System.out.println(df.format(res));
        }
    }
}
