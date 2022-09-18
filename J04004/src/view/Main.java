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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction f2 = new Fraction(sc.nextLong(), sc.nextLong());
        System.out.println(f1.add(f2)); 
    }
}

class Fraction {
    private long a;
    private long b;

    public Fraction() {
    }

    public Fraction(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }
    
    public Fraction simplifying() {
        long x = a, y = b;
        while (y != 0) {
            long tmp = x;
            x = y;
            y = tmp%y;
        }
        return new Fraction(a/x, b/x);
    }
    
    public Fraction add(Fraction f) {
        return new Fraction(a*f.b+b*f.a, b*f.b).simplifying();
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }
}