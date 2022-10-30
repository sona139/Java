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
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(res.isEmpty()) res += c;
            else if(c == res.charAt(res.length()-1))
                res = res.substring(0, res.length()-1);
            else res += c;
        }
        System.out.println(res.isEmpty() ? "Empty String" : res);
    }
}
