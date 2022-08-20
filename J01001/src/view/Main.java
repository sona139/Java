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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if(a <= 0 || b <= 0)
            System.out.println("0");
        else {
            int cv = (a+b)*2, dt = a*b;
            System.out.println(cv + " " + dt);
        }
    }
}
