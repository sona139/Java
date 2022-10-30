/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

class WordSet {
    private final TreeSet<String> res;

    public WordSet(String file) throws IOException {
        res = new TreeSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNext())
            res.add(sc.next().toLowerCase());
    }

    @Override
    public String toString() {
        return String.join("\n", res);
    }
}
