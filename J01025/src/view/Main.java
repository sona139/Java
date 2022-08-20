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
        List<Integer> p1 = new ArrayList<>(), p2 = new ArrayList<>(), p3 = new ArrayList<>();
        for (int i = 0; i < 4; i++)
            p1.add(sc.nextInt());
        for (int i = 0; i < 4; i++)
            p2.add(sc.nextInt());
        for (int i = 0; i < 4; i++)
            if(i < 2)
                p3.add(Math.min(p1.get(i), p2.get(i)));
            else
                p3.add(Math.max(p1.get(i), p2.get(i)));
        int a = Math.max(p3.get(2)-p3.get(0), p3.get(3)-p3.get(1));
        System.out.println(a*a);
    }
}
