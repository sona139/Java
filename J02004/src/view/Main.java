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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++)
                list.add(sc.nextInt());
            System.out.println(palindrome(list));
        }
    }
    
    private static String palindrome(List<Integer> list) {
        for (int i = 0; i <= list.size()/2; i++) {
            if (list.get(i) != list.get(list.size()-i-1)) {
                return "NO";
            }
        }
        return "YES";
    }
}
