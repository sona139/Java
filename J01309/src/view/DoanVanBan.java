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
public class DoanVanBan {
    private String s;

    public DoanVanBan() {
        s = "";
    }

    public DoanVanBan(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap doan van ban: ");
        s = sc.nextLine();
        System.out.println("----------------------------------------");
    }
    
    public void soCau() {
        if (s.equals("")) {
            System.out.println("Ban chua nhap doan van ban!");
            System.out.println("----------------------------------------");
            return ;
        }
        int soCau = 0;
        for (int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!')
                soCau++;
        System.out.println("Doan van ban co tat ca " + soCau + " cau");
        System.out.println("----------------------------------------");
    }
    
    public void chuanHoa() {
        if (s.equals("")) {
            System.out.println("Ban chua nhap doan van ban!");
            System.out.println("----------------------------------------");
            return ;
        }
        String cpy = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '.' || c == '?' || c == '!')
                cpy += " " + c + " ";
            else cpy += c;
        }
        String[] list = cpy.trim().toLowerCase().split("\\s+");
        String res = list[0].substring(0, 1).toUpperCase() + list[0].substring(1);
        for (int i = 1; i < list.length; i++) {
            if(list[i].equals(".") || list[i].equals("!") || list[i].equals("?"))
                res += list[i];
            else if(list[i-1].equals(".") || list[i-1].equals("!") || list[i-1].equals("?"))
                res += " " + list[i].substring(0, 1).toUpperCase() + list[i].substring(1);
            else res += " " + list[i];
        }
        this.s = res;
        System.out.println("Doan van ban sau khi chuan hoa la:");
        System.out.println(s);
        System.out.println("----------------------------------------");
    }
}
