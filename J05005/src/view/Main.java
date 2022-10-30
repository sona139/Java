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
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        SVs s = new SVs();
        for (int i = 0; i < n; i++) {
            s.list.add(new SV("B20DCCN" + String.format("%03d", s.list.size()+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        
        Collections.sort(s.list, new Comparator<SV>() {
            @Override
            public int compare(SV o1, SV o2) {
                return (o1.getGpa() > o2.getGpa()) ? -1 : 1;
            }
            
        });
        
        for (SV i : s.list) {
            System.out.println(i);
        }
    }
}

class SV {
    private String id;
    private String name;
    private String gr;
    private String birth;
    private float gpa;

    public SV() {
    }

    public SV(String id, String name, String gr, String birth, float gpa) {
        this.id = id;
        setName(name.toLowerCase().trim().split("\\s+"));
        this.gr = gr;
        String[] birthDay = birth.split("/");
        this.birth = String.format("%02d", Integer.parseInt(birthDay[0])) + "/" + String.format("%02d", Integer.parseInt(birthDay[1])) + "/" + birthDay[2];
        this.gpa = gpa;
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

    public void setName(String[] list) {
        String fname = "";
        for (String i : list) {
            fname += Character.toUpperCase(i.charAt(0)) + i.substring(1, i.length());
            fname += " ";
        }
        this.name = fname;
    }

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.gr + " " + this.birth + " " + String.format("%.2f", gpa);
    }
}

class SVs {
    List<SV> list;

    public SVs() {
        list = new ArrayList<>();
    }
}
