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
        int t = sc.nextInt();
        while(t-- > 0) {
            Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
            System.out.println(p1.isTriple(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble())));
        }
    }
}

class Point {
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(Point other) {
        return Math.sqrt((this.x-other.x)*(this.x-other.x) + (this.y-other.y)*(this.y-other.y));
    }
    
    public String isTriple(Point other1, Point other2) {
        double a = this.distance(other1);
        double b = this.distance(other2);
        double c = other1.distance(other2);
        if(a+b > c && a+c > b && b+c > a)
            return String.format("%.3f", a+b+c);
        return "INVALID";
    }
}
