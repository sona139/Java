/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MH> l = new ArrayList<>();
        while(t-->0) {
            l.add(new MH(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(l, new Comparator<MH>() {
            @Override
            public int compare(MH o1, MH o2) {
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        
        for (MH i : l)
            System.out.println(i);
    }
}

class MH{
    private String id, name, ht;

    public MH() {
    }

    public MH(String id, String name, String ht) {
        this.id = id;
        this.name = name;
        this.ht = ht;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + ht;
    }
    
    
}
