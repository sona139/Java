/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String file = "VANBAN.in";
        Scanner sc = new Scanner(new FileInputStream(file));
        Map<String, Integer> map = new HashMap<>();
        try {
            while(sc.hasNext()) {
                try {
                    map.put(sc.next().toLowerCase(), 1);
                } catch (Exception e) {}
            }
        } catch (Exception e) {
            sc.close();
        }
        Set <String> set = map.keySet();
        for (String key : set)
            System.out.println(key);
    }
}
