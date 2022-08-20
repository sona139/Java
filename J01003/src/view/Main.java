/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt(), b = sc.nextInt();
        if(a == 0 && b == 0)
            System.out.println("VSN");
        else if(a == 0)
            System.out.println("VN");
        else {
            float c = -b/a;
            DecimalFormat f = new DecimalFormat("#0.00");
            System.out.println(f.format(c));
        }
    }
}
