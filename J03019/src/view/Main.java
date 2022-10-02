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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] rightMax = new int[n];
        rightMax[n-1] = s.charAt(n-1);
        for (int i = n-2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i+1], s.charAt(i));
        String res = "";
        for (int i = 0; i < n; i++)
            if(s.charAt(i) >= rightMax[i])
                res += s.charAt(i);
        System.out.println(res);
    }
    
}
