/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TS ts = new TS(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
        System.out.println(ts);
    }
}

class TS{
    private String name, birth;
    private float d1, d2, d3, total;

    public TS() {
    }

    public TS(String name, String birth, float d1, float d2, float d3) {
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.total = d1+d2+d3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
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
        return this.name + " " + this.birth + " " + this.total;
    }
}
