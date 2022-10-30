/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> res = new ArrayList<>();
        while(sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                res.add(s);
            }
        }
        res.sort((String a, String b) -> {
            return a.compareTo(b);
        });
        System.out.println(String.join(" ", res));
    }
}
