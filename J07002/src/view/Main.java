/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "DATA.in";
        Scanner sc = new Scanner(new FileInputStream(file));
        long sum = 0;
        try {
            while(sc.hasNext()) {
                try {
                    sum += Integer.parseInt(sc.next());
                }
                catch (Exception e) {}
            }
        } catch (Exception e) {
            sc.close();
        }
        System.out.println(sum);
    }
}
