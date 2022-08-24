/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "Hello.txt";
        try (Scanner sc = new Scanner(new FileInputStream(file))) {
            while(sc.hasNextLine())
                System.out.println(sc.nextLine());
        }   
    }
}
