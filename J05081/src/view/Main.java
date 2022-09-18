/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++)
            products.add(new Product(String.format("MH%03d", i+1), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        products.sort((a, b) -> {
            if(a.getProfit() != b.getProfit())
                return b.getProfit()-a.getProfit();
            return a.getId().compareTo(b.getId());
        });
        products.forEach(System.out::println);
    }
}

class Product {
    private String id;
    private String name;
    private String unit;
    private int priceIn;
    private int priceOut;

    public Product() {
    }

    public Product(String id, String name, String unit, int priceIn, int priceOut) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
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
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(int priceIn) {
        this.priceIn = priceIn;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(int priceOut) {
        this.priceOut = priceOut;
    }
    
    public int getProfit() {
        return priceOut-priceIn;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + priceIn + " " + priceOut + " " + getProfit();
    }
}
