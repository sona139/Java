/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import java.util.HashMap;
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
            String[] list1 = sc.nextLine().split("\\s+");
            String[] list2 = sc.nextLine().split("\\s+");
            HashMap<String, Integer> map = new HashMap<>();
            for (String i : list2)
                map.put(i, 1);
            Arrays.sort(list1);
            for (String i : list1)
                if(map.get(i) == null) {
                    System.out.print(i + " ");
                    map.put(i, 1);
                }
            System.out.println("");
        }
    }
}
