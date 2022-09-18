/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ElectricityBill> bills = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            bills.add(new ElectricityBill(String.format("KH%02d", i), sc.nextLine(), sc.nextLine().trim().split("\\s+")));
        bills.sort((a, b) -> {
            return b.getTotalMoney()-a.getTotalMoney();
        });
        bills.forEach(System.out::println);
    }
}

class ElectricityBill {
    private String id;
    private String name;
    private int first, last;
    private String typeOfHousehold;

    public ElectricityBill(String id, String name, String[] list) {
        this.id = id;
        setName(name);
        this.typeOfHousehold = list[0];
        this.first = Integer.parseInt(list[1]);
        this.last = Integer.parseInt(list[2]);
    }

    public ElectricityBill() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] list = name.trim().split("\\s+");
        for (int i = 0; i < list.length; i++)
            list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1).toLowerCase();
        this.name = String.join(" ", list);
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public String getTypeOfHousehold() {
        return typeOfHousehold;
    }

    public void setTypeOfHousehold(String typeOfHousehold) {
        this.typeOfHousehold = typeOfHousehold;
    }
    
    private int getNorm() {
        switch(typeOfHousehold) {
            case "A":
                return 100;
            case "B":
                return 500;
            default:
                return 200;
        }
    }
    
    private int getMoneyInNorm() {
        int norm = getNorm();
        int electricNumber = last-first;
        if (electricNumber <= norm) return electricNumber*450;
        return norm*450;
    }
    
    private int getMoneyOutNorm() {
        int norm = getNorm();
        int electricNumber = last-first;
        if (electricNumber <= norm) return 0;
        return (electricNumber-norm)*1000;
    }
    
    public int getTotalMoney() {
        return (int) (getMoneyInNorm() + getMoneyOutNorm()*1.05);
    }
    
    private int getVAT() {
        return (int) (getMoneyOutNorm()*0.05);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getMoneyInNorm() + " " + getMoneyOutNorm() + " " + getVAT() + " " + getTotalMoney();
    }
}
