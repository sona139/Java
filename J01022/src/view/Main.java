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
    private static List<Long> F = new ArrayList<>();
    
    private static void Fibo() {
        F.add((long) 1);
        F.add((long) 1);
        for (int i = 2; i < 93; i++) {
            F.add(F.get(i-1) + F.get(i-2));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibo();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            System.out.println(bsearch(a-1, b));
        }
    }
    
    private static int bsearch(int a, long b) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        if (b > F.get(a-2)) return bsearch(a-1, b-F.get(a-2));
        return bsearch(a-2, b);
    }
}
