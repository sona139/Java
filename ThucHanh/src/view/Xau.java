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
public class Xau {
    private String s;

    public Xau() {
        s = "";
    }

    public Xau(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    public void nhap() {
        System.out.print("Nhap xau s: ");
        Scanner sc = new Scanner(System.in);
        this.s = sc.nextLine();
        this.s = this.s.trim();
    }
    
    public void soCau() {
        if(s.equals("")) {
            System.out.println("Ban chua nhap xau s!");
            return ;
        }
        int soCau = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '.' || c == '!' || c == '?')
                soCau++;
        }
        char c = s.charAt(s.length()-1);
        if(c != '.' && c != '?' && c != '!') soCau++;
        System.out.println("Co tat ca " + soCau + " cau trong xau");
    }
    
    public void chuanHoa() {
        if(s.equals("")) {
            System.out.println("Ban chua nhap xau s!");
            return ;
        }
        String[] list = this.s.toLowerCase().split("\\s+");
        String res = "";
        for (int i = 1; i < list.length; i++)
            res += list[i].substring(0, 1).toUpperCase() + list[i].substring(1) + " ";
        if(list.length == 1) res = list[0].trim().toUpperCase();
        else res = res.trim() +  ", " + list[0].toUpperCase();
        System.out.println("Ho ten sau khi da chuan hoa la: " + res);
    }
}
