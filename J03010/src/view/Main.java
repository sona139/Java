/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listEmail = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            String[] a = sc.nextLine().trim().toLowerCase().split("\\s+");
            String newEmail = a[a.length-1];
            for (int i = 0; i < a.length-1; i++)
                newEmail += a[i].charAt(0);
            listEmail.add(newEmail);
            int cnt = Collections.frequency(listEmail, newEmail);
            if (cnt > 1) newEmail += cnt;
            newEmail += "@ptit.edu.vn";
            System.out.println(newEmail);
        }
    }
}
