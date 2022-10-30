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
        ArrayList<SV> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
            list.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        Collections.sort(list, new Comparator<SV>() {
            @Override
            public int compare(SV o1, SV o2) {
                if (!o1.getGr().equals(o2.getGr())) {
                    return o1.getGr().compareTo(o2.getGr());
                }
                return o1.getCode().compareTo(o2.getCode());
            }
        });
        for (SV i : list)
            System.out.println(i);
    }
}

class SV {
    private String code;
    private String name;
    private String gr;
    private String mail;

    public SV(String code, String name, String gr, String mail) {
        this.code = code;
        this.name = name;
        this.gr = gr;
        this.mail = mail;
    }

    public SV() {
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

    public String getGr() {
        return gr;
    }

    public void setGr(String gr) {
        this.gr = gr;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + gr + " " + mail;
    }
}
