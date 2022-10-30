/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class DaySoNguyen {
    private int[] a;
    private int n;

    public DaySoNguyen() {
    }

    public DaySoNguyen(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void nhap() {
        System.out.print("Nhap so phan tu cua day: ");
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
        a =  new int[n];
        System.out.println("Nhap " + n + " phan tu cua day: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan thu tu " + i + ": ");
            a[i] = sc.nextInt();
        }
    }
    
    public void GTLNvaGTNN() {
        if(n == 0) {
            System.out.println("Ban chua nhap day so!");
            return ;
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        System.out.println("Gia tri lon nhat cua day la: " + max);
        System.out.println("Gia tri nho nhat cua day la: " + min);
    }
    
    public void soLanXuatHien() {
        if(n == 0) {
            System.out.println("Ban chua nhap day so!");
            return ;
        }
        int[] map = new int[10000];
        Arrays.fill(map, 0);
        for (int i : a) map[i]++;
        System.out.println("So lan xuat hien cua cac phan tu trong day:");
        for (int i = 0; i < 10000; i++)
            if(map[i] != 0)
                System.out.println(i + " xuat hien " + map[i] + " lan");
    }
}
