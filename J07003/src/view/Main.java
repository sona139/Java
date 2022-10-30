/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        while(s.length() > 1) {
            BigInteger b1 = new BigInteger(s.substring(0, s.length()/2));
            BigInteger b2 = new BigInteger(s.substring(s.length()/2, s.length()));
            s = b1.add(b2).toString();
            System.out.println(s);
        }
    }
}
