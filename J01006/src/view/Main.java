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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        list.add((long)1);
        list.add((long)1);
        for (int i = 2; i < 92; i++)
            list.add(list.get(i-1) + list.get(i-2));
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.println(list.get(n-1));
        }
    }
}
