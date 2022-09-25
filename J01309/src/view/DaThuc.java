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
public class DaThuc {
    private int bac;
    private float[] dt;

    public DaThuc() {
    }

    public DaThuc(int bac, float[] dt) {
        this.bac = bac;
        this.dt = new float[bac+1];
        for (int i = 0; i <= bac; i++)
            this.dt[i] = dt[i];
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public float[] getDt() {
        return dt;
    }

    public void setDt(float[] dt) {
        this.dt = dt;
    }
    
    public void nhap() {
        System.out.print("Nhap bac cua da thuc: ");
        Scanner sc = new Scanner(System.in);
        this.bac = sc.nextInt();
        dt =  new float[bac+1];
        System.out.println("Nhap he so cua da thuc bac " + bac + ":");
        for (int i = 0; i <= bac; i++) {
            System.out.print("Nhap he so cua x^" + i + ": ");
            dt[i] = sc.nextFloat();
        }
        System.out.println("----------------------------------------");
    }
    
    public void cong(DaThuc other) {
        if(bac == 0) {
            System.out.println("Ban chua nhap da thuc P!");
            System.out.println("----------------------------------------");
            return ;
        }
        int bac = Integer.max(this.bac, other.bac);
        float[] res = new float[bac+1];
        for (int i = 0; i <= bac; i++) {
            if(i > this.bac) res[i] = other.dt[i];
            else if(i > other.bac) res[i] = this.dt[i];
            else res[i] = this.dt[i] + other.dt[i];
        }
        System.out.println("Da thuc tong la: ");
        System.out.println(printDathuc(res));
        System.out.println("----------------------------------------");
    }
    
    public String printDathuc(float heso[]) {
        int bac = 0;
        for (float f : heso)
            if (f != 0) bac++;
        if(bac == 0) return "0";
        String[] ans = new String[bac];
        int index = 0;
        for (int i = 0; i < heso.length; i++)
            if(heso[i] != 0) {
                ans[index] = heso[i] + "x^" + i;
                index ++;
            }
        return String.join(" + ", ans);
    }
    
    public void chia(DaThuc other) {
        if(bac == 0) {
            System.out.println("Ban chua nhap da thuc P!");
            System.out.println("----------------------------------------");
            return ;
        }
        float[] cpy = new float[this.bac+1];
        for (int i = 0; i <= this.bac; i++)
            cpy[i] = this.dt[i];
        
        int index = 0;
        float[] res = new float[this.bac+1];
        for (int i = this.bac; i >= other.bac; i--) {
            int con = other.bac - index;
            if (cpy[i] == 0 || other.dt[con] == 0) continue;
            float heso = cpy[i]/other.dt[con];
            res[i-other.bac] = heso;
            for (int j = 0; j <= other.bac; j++)
                cpy[i-j] -= other.dt[other.bac-j]*heso;
            index++;
        }
        System.out.print("Da thuc thuong la: ");
        System.out.println(printDathuc(res));
        
        System.out.print("Da thuc du la: ");
        System.out.println(printDathuc(cpy));
        System.out.println("----------------------------------------");
    }
}
