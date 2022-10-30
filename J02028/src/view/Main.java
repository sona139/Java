/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println(somethingIsntCorrect(a, k, n));
        }
    }
    private static String somethingIsntCorrect(int[] a, long k, int n) {
        long sum = 0;
        int indexBegin = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            while(sum > k) {
                sum -= a[indexBegin];
                indexBegin++;
            }
            if (sum == k && indexBegin != i+1) {
                return "YES";
            }
        }
        return "NO";
    }
}
