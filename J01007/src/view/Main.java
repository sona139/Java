/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    static List<Long> list = new ArrayList<>();
    static void Fibo() {
        list.add((long)0);
        list.add((long)1);
        for (int i = 2; i <= 93; i++)
            list.add(list.get(i-1) + list.get(i-2));
    }
    public static void main(String[] args) {
        Fibo();
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            long n = Long.parseLong(sc.nextLine());
            if(list.indexOf(n) == -1)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
