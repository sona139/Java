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
public class SoThuc {
    private int m, n;

    public SoThuc() {
    }

    public SoThuc(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap m: ");
        this.m = sc.nextInt();
        System.out.print("Nhap n: ");
        this.n = sc.nextInt();
        System.out.println("----------------------------------------");
    }
    
    public int getGcd() {
        int a = m, b = n;
        while(b > 0) {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
    
    public void uclnVaBcnn() {
        if(m <= 0 || n <= 0) {
            System.out.println("m va n phai lon hon 0");
            System.out.println("----------------------------------------");
            return ;
        }
        int gcd = getGcd();
        System.out.println("Uoc chung lon nhat cua " + m + " va " + n + " la: " + gcd);
        System.out.println("Boi chung nho nhat cua " + m + " va " + n + " la: " + m/gcd*n/gcd*gcd);
        System.out.println("----------------------------------------");
    }
    
    public boolean isPrime(int n) {
        if (n == 2 || n == 3) return true;
        if (n%2 == 0 || n%3 == 0 || n < 5) return false;
        for (int i = 5; i <= Math.sqrt(n);i += 6)
            if (n%i == 0 || n%(i+2) == 0) return false;
        return true;
    }
    
    public void sntTuMDenN() {
        if(m <= 0 || n <= 0) {
            System.out.println("m va n phai lon hon 0");
            System.out.println("----------------------------------------");
            return ;
        }
        System.out.print("Cac so nguyen to tu " + m + " den " + n + " la: ");
        int cnt = 0;
        for (int i = m; i <= n; i++)
            if(isPrime(i)) {
                System.out.print(i + " ");
                cnt++;
            }
        System.out.println("");
        System.out.println("Co tat ca " + cnt + " so nguyen to tu " + m + " den " + n);
        System.out.println("----------------------------------------");
    }
}
