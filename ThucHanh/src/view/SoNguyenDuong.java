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
public class SoNguyenDuong {
    private int n;

    public SoNguyenDuong() {
    }

    public SoNguyenDuong(int n) {
        this.n = n;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        this.n = sc.nextInt();
    }
    
    public boolean isPrime(int n) {
        if(n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if(n%i == 0) return false;
        return true;
    }
    
    public void uocSnt() {
        if(n <= 0) {
            System.out.println("N phai la mot so nguyen duong");
            return ;
        }
        System.out.print("Cac uoc so nguyen to cua n la: ");
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if(n%i == 0 && isPrime(i)) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println("");
        System.out.println("Co tat ca " + cnt + " uoc so nguyen to cua n");
    }
    
    public void fibo() {
        if(n <= 0) {
            System.out.println("N phai la mot so nguyen duong");
            return ;
        }
        System.out.print("Cac so fibonacci nho hon n la: ");
        int a = 1, b = 1;
        while(b <= n) {
            System.out.print(b + " ");
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println("");
    }
}
