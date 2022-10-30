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
        Scanner sc = new Scanner(new FileInputStream("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<DN> list = new ArrayList<>();
        while(t-- > 0) {
            list.add(new DN(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, new Comparator<DN>(){
            @Override
            public int compare(DN o1, DN o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (DN i:list)
            System.out.println(i);
    }
}

class DN{
    private String id;
    private String name;
    private int slot;

    public DN() {
    }

    public DN(String id, String name, int slot) {
        this.id = id;
        this.name = name;
        this.slot = slot;
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

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + slot;
    }
}
