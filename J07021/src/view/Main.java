/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String name = sc.nextLine();
            if (name.equals("END"))
                break;
            String[] list = name.trim().split("\\s+");
            for (int i = 0; i < list.length; i++)
                list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1, list[i].length()).toLowerCase();
            System.out.println(String.join(" ", list));
        }
    }
}
