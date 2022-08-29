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
        ArrayList<GV> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new GV(String.format("GV%02d", list.size()+1), sc.nextLine(), sc.nextLine()));
        Collections.sort(list, new Comparator<GV>() {
            @Override
            public int compare(GV o1, GV o2) {
                if (!o1.getLastName().equals(o2.getLastName())) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }
                return o1.getCode().compareTo(o2.getCode());
            }
        });
        
        for (GV i : list)
            System.out.println(i);
    }
}

class GV{
    private String code;
    private String name;
    private String mh;
    private String lastName;

    public GV() {
    }

    public GV(String code, String name, String mh) {
        this.name = name;
        this.code = code;
        setMh(mh.split("\\s+"));
        setLastName(name.split("\\s+"));
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMh() {
        return mh;
    }

    public void setMh(String[] list) {
        String mh = "";
        for (String i : list)
            mh += Character.toUpperCase(i.charAt(0));
        this.mh = mh;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String[] name) {
        this.lastName = name[name.length-1];
    }
    
    @Override
    public String toString() {
        return this.code + " " + this.name + " " + this.mh;
    }
}
