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
        ArrayList<NV> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new NV(String.format("%05d", i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        for(NV i : list)
            System.out.println(i);
    }
}

class NV{
    private String id;
    private String name;
    private String sex;
    private String birth;
    private String dc;
    private String fax;
    private String date;

    public NV() {
    }

    public NV(String id, String name, String sex, String birth, String dc, String fax, String date) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
        this.dc = dc;
        this.fax = fax;
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + birth + " " + dc + " " + fax + " " + date;   
    }
}