/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SVs s = new SVs();
        s.list.add(new SV("B20DCCN" + String.format("%03d", s.list.size()+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        System.out.println(s.list.get(0));
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
        this.name = name;
        this.gr = gr;
        String[] birthDay = birth.split("/");
        this.birth = String.format("%02d", Integer.parseInt(birthDay[0])) + "/" + String.format("%02d", Integer.parseInt(birthDay[1])) + "/" + birthDay[2];
        DecimalFormat df = new DecimalFormat("#.00");
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

    public void setName(String name) {
        this.name = name;
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
        DecimalFormat df = new DecimalFormat("#.00");
        return this.id + " " + this.name + " " + this.gr + " " + this.birth + " " + df.format(this.gpa);
    }
}

class SVs {
    List<SV> list;

    public SVs() {
        list = new ArrayList<>();
    }
}
