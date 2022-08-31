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
    }
}

class Point3D{
    private int x, y, z;

    public Point3D() {
    }

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        Point3D vt1 = new Point3D(p2.getX()-p1.getX(), p2.getY()-p1.getY(), p2.getZ()-p1.getZ());
        Point3D vt2 = new Point3D(p3.getX()-p1.getX(), p3.getY()-p1.getY(), p3.getZ()-p1.getZ());
        Point3D vt3 = new Point3D(p4.getX()-p1.getX(), p4.getY()-p1.getY(), p4.getZ()-p1.getZ());
        Point3D vtch = new Point3D(vt1.getY()*vt2.getZ()-vt1.getZ()*vt2.getY(), vt1.getZ()*vt2.getX()-vt1.getX()*vt2.getZ(), vt1.getX()*vt2.getY()-vt1.getY()*vt2.getX());
        if (vtch.getX()*vt3.getX() + vtch.getY()*vt3.getY() + vtch.getZ()*vt3.getZ() == 0) {
            return true;
        }
        return false;
    }
}
