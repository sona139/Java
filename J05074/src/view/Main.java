/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        for (int i = 0; i < n; i++) {
            String id = sc.next(), cc = sc.next();
            for (int j = 0; j < n; j++)
                if(list.get(j).getId().equals(id)) {
                    list.get(j).setScore(cc);
                    break;
                }
        }
        for (SV i : list)
            System.out.println(i);
    }
}

class SV{
    private String id;
    private String name;
    private String gr;
    private int score;
    private String note;

    public SV() {
    }

    public SV(String id, String name, String gr) {
        this.id = id;
        this.name = name;
        this.gr = gr;
        this.score = -1;
        this.note = "";
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public int getScore() {
        return score;
    }

    public void setScore(String cc) {
        int m = 0, v = 0;
        for (char i : cc.toCharArray())
            if (i == 'm') m++;
            else if(i == 'v') v++;
        this.score = Math.max(0, 10-m-2*v);
        if(this.score == 0) this.note = "KDDK";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gr + " " + score + " " + note;
    }
}
