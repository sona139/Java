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
        for (int i = 1; i <= n; i++)
            products.add(new Product(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        products.sort((a, b) -> {
            if (a.getProfit() > b.getProfit()) return -1;
            return 1;
        });
        products.forEach(System.out::println);
    }
}

class Product {
    int id;
    private String name, type;
    private double priceIn, priceOut;

    public Product() {
    }

    public Product(int id, String name, String type, double priceIn, double priceOut) {
        this.name = name;
        this.type = type;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(double priceIn) {
        this.priceIn = priceIn;
    }

    public double getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(double priceOut) {
        this.priceOut = priceOut;
    }

    public double getProfit() {
        return priceOut-priceIn;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + type + " " + String.format("%.2f", getProfit());
    }
}
