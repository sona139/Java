package view;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String[] ss = sc.nextLine().split("\\s+");
            String res = "";
            for (String item : ss) {
                StringBuilder word = new StringBuilder(item);
                res += word.reverse().toString() + " ";
            }
            System.out.println(res.trim());
        }
    }
}
