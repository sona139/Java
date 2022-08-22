/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a[] = sc.nextLine().toCharArray();
        int m[] = new int[200];
        Arrays.fill(m, 0);
        for (char i : a)
            m[(int)i] = 1;
        int cnt = 0;
        for (int i = (int)'a'; i <= (int)'z'; i++)
            if (m[i] == 1)
                ++cnt;
        System.out.println(cnt);
    }
}
