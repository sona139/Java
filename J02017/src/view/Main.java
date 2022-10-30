/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (list.isEmpty()) list.add(num);
            else if((list.get(list.size()-1)+num)%2 == 0)
                list.remove(list.size()-1);
            else list.add(num);
        }
        System.out.println(list.size());
    }
}
