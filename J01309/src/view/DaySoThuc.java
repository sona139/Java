package view;

import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hongs
 */
public class DaySoThuc {
    private int n;
    private float[] a;

    public DaySoThuc() {
        a = new float[0];
    }

    public DaySoThuc(int n, float[] a) {
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
        System.out.print("Nhap so phan tu cua day: ");
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
        a =  new float[n];
        System.out.println("Nhap " + n + " phan tu cua day: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan thu tu " + i + ": ");
            a[i] = sc.nextFloat();
        }
    }
    
    public void phanTuNhoNhat() {
        if(n == 0) {
            System.out.println("Ban chua nhap day so!");
            return ;
        }
        float min = Float.MAX_VALUE;
        for (float i : a)
            min = Math.min(min, i);
        System.out.println("Phan tu nho nhat cua day la: " + min);
    }
    
    public void sapXep() {
        if(n == 0) {
            System.out.println("Ban chua nhap day so!");
            return ;
        }
        Arrays.sort(a);
        System.out.print("Day so sau khi sap xep la: ");
        for (float i : a) System.out.print(i + " ");
        System.out.println("");
    }
}
