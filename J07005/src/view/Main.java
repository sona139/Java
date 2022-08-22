/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "DATA.in";
        Scanner sc = new Scanner(new FileInputStream(file));
        int m[] = new int[10000];
        Arrays.fill(m, 0);
        try {
            while(sc.hasNext()) {
                try {
                    m[Integer.parseInt(sc.next(), 2)]++;
                } catch(Exception e) {}
            }
        } catch (Exception e){
            sc.close();
        }
        for (int i = 0; i <= 10000; i++)
            if(m[i] != 0) {
                System.out.println(i + " " + m[i]);
            }
//        System.out.println(Integer.parseInt("111", 2));
    }
}
