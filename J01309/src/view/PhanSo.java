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
public class PhanSo {
    private int tu1, mau1, tu2, mau2;

    public PhanSo() {
    }

    public PhanSo(int tu1, int mau1, int tu2, int mau2) {
        this.tu1 = tu1;
        this.mau1 = mau1;
        this.tu2 = tu2;
        this.mau2 = mau2;
    }

    public int getTu1() {
        return tu1;
    }

    public void setTu1(int tu1) {
        this.tu1 = tu1;
    }

    public int getMau1() {
        return mau1;
    }

    public void setMau1(int mau1) {
        this.mau1 = mau1;
    }

    public int getTu2() {
        return tu2;
    }

    public void setTu2(int tu2) {
        this.tu2 = tu2;
    }

    public int getMau2() {
        return mau2;
    }

    public void setMau2(int mau2) {
        this.mau2 = mau2;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan so thu nhat:");
        System.out.print("Nhap tu so: ");
        this.tu1 = sc.nextInt();
        System.out.print("Nhap mau so: ");
        this.mau1 = sc.nextInt();
        System.out.println("Nhap phan so thu hai:");
        System.out.print("Nhap tu so: ");
        this.tu2 = sc.nextInt();
        System.out.print("Nhap mau so: ");
        this.mau2 = sc.nextInt();
    }
    
    public int Gcd(int tu, int mau) {
        int a = tu, b = mau;
        while(b != 0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return Math.abs(a);
    }
    
    public void tong() {
        if(mau1 == 0 || mau2 == 0) {
            System.out.println("Mau cua phan so phai khac 0");
            return ;
        }
        int tu = this.tu1*this.mau2 + this.tu2*this.mau1;
        int mau = this.mau1*this.mau2;
        int gcd = Gcd(tu, mau);
        tu /= gcd;
        mau /= gcd;
        System.out.println("Tong 2 phan so la: " + tu + "/" + mau);
    }
    
    public void hieu() {
        if(mau1 == 0 || mau2 == 0) {
            System.out.println("Mau cua phan so phai khac 0");
            return ;
        }
        int tu = this.tu1*this.mau2 - this.tu2*this.mau1;
        int mau = this.mau1*this.mau2;
        int gcd = Gcd(tu, mau);
        tu /= gcd;
        mau /= gcd;
        System.out.println("Hieu 2 phan so la: " + tu + "/" + mau);
    }
}
