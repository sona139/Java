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
        ArrayList<SV> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
            list.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            String sYear = sc.nextLine().substring(2, 4);
            System.out.format("DANH SACH SINH VIEN KHOA 20%s:\n", sYear);
            for (SV sv : list)
                if(sv.getsYear().equals(sYear))
                    System.out.println(sv);
        }
    }
}

class SV {
    private String code;
    private String name;
    private String gr;
    private String mail;
    private String sYear;

    public SV(String code, String name, String gr, String mail) {
        this.code = code;
        this.name = name;
        this.gr = gr;
        this.mail = mail;
        this.sYear = gr.substring(1, 3);
    }

    public SV() {
    }
    
    public String getsYear() {
        return sYear;
    }

    public void setsYear(String sYear) {
        this.sYear = sYear;
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
