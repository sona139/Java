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
public class SoNguyenFB {
    private int n;

    public SoNguyenFB() {
    }

    public SoNguyenFB(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void nhap() {
        System.out.print("Nhap so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
    }
    
    public boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n%2 == 0 || n%3 == 0 || n < 5) return false;
        for (int i = 5; i <= Math.sqrt(n);i += 6)
            if (n%i == 0 || n%(i+2) == 0) return false;
        return true;
    }
    
    public void fibo() {
        if(n <= 0) {
            System.out.println("N phai > 0");
            return ;
        }
        int a = 0, b = 1;
        System.out.println("Cac so fibo la so nguyen to nho hon hoac bang n la:");
        while(b <= n) {
            if(isPrime(b))
                System.out.print(b + " ");
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println("");
    }
    
    public void thuanNghich() {
        if(n <= 0) {
            System.out.println("N phai > 0");
            return ;
        }
        StringBuilder number = new StringBuilder(Integer.toString(n));
        StringBuilder convert = new StringBuilder(Integer.toString(n));
        convert.reverse();
        if (number.toString().equals(convert.toString())) System.out.println("N la so thuan nghich");
        else System.out.println("N khong phai la so thuan nghich");
    }
}
