/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author hongs
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet {
    private TreeSet<String> set;

    public WordSet() {
    }

    public WordSet(String s) {
        set = new TreeSet<>();
        set.addAll(Arrays.asList(s.trim().toLowerCase().split("\\s+")));
    }

    public TreeSet<String> getSet() {
        return set;
    }

    public void setSet(TreeSet<String> set) {
        this.set = set;
    }
    
    public String union(WordSet other) {
        TreeSet<String> newTree = (TreeSet<String>) set.clone();
        newTree.addAll(other.getSet());
        return String.join(" ", newTree);
    }
    
    public String intersection(WordSet other){ 
        TreeSet<String> newTree = (TreeSet<String>) set.clone();
        newTree.retainAll(other.getSet());
        return String.join(" ", newTree);
    }
}
