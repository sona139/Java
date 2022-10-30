/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Sv> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            l.add(new Sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        }
        
        Collections.sort(l, new Comparator<Sv>() {
            @Override
            public int compare(Sv o1, Sv o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + " " + l.get(i));
        }
    }
}

class Sv{
    private String id, name, gr;
    private float d1, d2, d3;

    public Sv() {
    }

    public Sv(String id, String name, String gr, float d1, float d2, float d3) {
        this.id = id;
        this.name = name;
        this.gr = gr;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
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

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public float getD1() {
        return d1;
    }

    public void setD1(float d1) {
        this.d1 = d1;
    }

    public float getD2() {
        return d2;
    }

    public void setD2(float d2) {
        this.d2 = d2;
    }

    public float getD3() {
        return d3;
    }

    public void setD3(float d3) {
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gr + " " + d1 + " " + d2 + " " + d3;
    }
}
