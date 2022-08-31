/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new T(i+1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        float score = 0;
        for (T i : list)
            score = Math.max(score, i.getScore());
        for (T i : list)
            if(i.getScore() == score)
                System.out.println(i);
    }
}

class T{
    private int id;
    private String name;
    private String birth;
    private float d1, d2, d3;
    private float score;

    public T() {
    }

    public T(int id, String name, String birth, float d1, float d2, float d3) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.score = d1+d2+d3;
    }

    public int getId() {
        return id;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birthl) {
        this.birth = birthl;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + birth + " " + score;
    }
}
