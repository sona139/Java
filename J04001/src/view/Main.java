/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.DecimalFormat;
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
            Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
            DecimalFormat d = new DecimalFormat("##.0000");
            System.out.println(d.format(p1.distance(p2)));
        }
    }
}

class Point{
    private double x;
    private double y;

    public Point() {}
    
    public Point(Point a) {
        this.x = a.x;
        this.y = a.y;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point a) {
        return Math.sqrt((this.x-a.x)*(this.x-a.x) + (this.y-a.y)*(this.y-a.y));
    }
    
    public double distance(Point a, Point b) {
        return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
    }
}