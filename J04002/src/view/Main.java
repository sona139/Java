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
        Rectange r = new Rectange(sc.nextInt(), sc.nextInt(), sc.next());
        if (r.getHeight() <= 0 || r.getWidth() <= 0) {
            System.out.println("INVALID");
        }
        else
            System.out.println(r);
    }
}

class Rectange{
    private int width;
    private int height;
    private String color;

    public Rectange() {
    }

    public Rectange(int width, int height, String color) {
        this.width = width;
        this.height = height;
        setColor(color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        char[] s = color.toLowerCase().toCharArray();
        s[0] = Character.toUpperCase(s[0]);
        this.color = new String(s);
    }
    
    public int findArea() {
        return this.height*this.width;
    }
    
    public int findPerimeter() {
        return 2*(this.width+this.height);
    }
    
    @Override
    public String toString() {
        return this.findPerimeter() + " " + this.findArea() + " " + this.color;
    }
}
