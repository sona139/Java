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
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String s = sc.nextLine();
            System.out.println(solve((s.substring(5, 8) + s.substring(9, 11)).toCharArray()));
        }
    }

    private static String solve(char[] c) {
        if(c[0] == c[1] && c[1] == c[2] && c[3] == c[4])
            return "YES";
        if(c[1]-c[0] == 1 && c[2]-c[1] == 1 && c[3]-c[2] == 1 && c[4]-c[3] == 1)
            return "YES";
        for (char i : c)
            if(i != '6' && i != '8')
                return "NO";
        return "YES";
    }
}
