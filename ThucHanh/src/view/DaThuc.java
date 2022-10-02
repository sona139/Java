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
    private int n;
    private float a[];

    public DaThuc() {
        a = new float[0];
    }

    public DaThuc(int n, float[] a) {
        this.n = n;
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public float[] getA() {
        return a;
    }

    public void setA(float[] a) {
        this.a = a;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap bac cua da thuc: ");
        this.n = sc.nextInt();
        System.out.println("Nhap da thuc bac " + n + ":");
        a = new float[n+1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Nhap bac cua x^" + i + ": ");
            a[i] = sc.nextFloat();
        }
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
    
    public void chia() {
        if(n == 0) {
            System.out.println("Ban chua nhap da thuc P!");
            return ;
        }
        System.out.println("Nhap da thuc Q:");
        System.out.print("Nhap bac cua da thuc Q: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Nhap da thuc Q bac " + m + ":");
        float[] b = new float[m+1];
        for (int i = 0; i <= m; i++) {
            System.out.print("Nhap bac cua x^" + i + ": ");
            b[i] = sc.nextFloat();
        }
        float[] cpy = new float[n+1];
        for (int i = 0; i <= this.n; i++)
            cpy[i] = this.a[i];
        
        float[] res = new float[this.n+1];
        for (int i = this.n; i >= m; i--) {
            if (cpy[i] == 0) continue;
            float heso = cpy[i]/b[m];
            res[i-m] = heso;
            for (int j = 0; j <= m; j++)
                cpy[i-j] -= b[m-j]*heso;
        }
        System.out.print("Da thuc thuong la: ");
        System.out.println(printDathuc(res));
        
        System.out.print("Da thuc du la: ");
        System.out.println(printDathuc(cpy));
    }
    
    public void tinh() {
        if(n == 0) {
            System.out.println("Ban chua nhap da thuc P!");
            return ;
        }
        float res = 0;
        int pow = 1;
        for (int i = 0; i <= n; i++) {
            res += a[i]*pow;
            pow *= 2;
        }
        System.out.println("Gia tri cua da thuc tai x = 2 la: " + res);
    }
}
