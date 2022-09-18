/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}

class LoaiPhong implements Comparable<LoaiPhong> {
    private String sign;
    private String type;
    private int pricePerDay;
    private double tip;

    public LoaiPhong(String s) {
        String[] list = s.trim().split("\\s+");
        this.sign = list[0];
        this.type = list[1];
        this.pricePerDay = Integer.parseInt(list[2]);
        this.tip = Double.parseDouble(list[3]);
    }

    public LoaiPhong() {
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }
    
    @Override
    public String toString() {
        return sign + " " + type + " " + pricePerDay + " " + tip;
    }
    
    @Override
    public int compareTo(LoaiPhong o) {
        return type.compareTo(o.getType());
    }
}
