/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] mk = new int[1000];
        Arrays.fill(mk, 0);
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            mk[num]++;
        }
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            mk[num]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (mk[i] != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
