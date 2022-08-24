/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
        int n = sc.nextInt(), k = sc.nextInt();
        List <Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++)
            l.add(sc.nextInt());
        Collections.sort(l, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        int i = 0;
        while(i < n && l.get(i) < 0 && i < k) {
            l.set(i, -l.get(i));
            i++;
        }
        Collections.sort(l, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        if ((k-i)%2 == 1) {
            l.set(0, -l.get(0));
        }
        long sum = 0;
        for (int j : l)
            sum += j;
        System.out.println(sum);
    }
    
}
