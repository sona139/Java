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
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++)
            products.add(new Product(String.format("MH%02d", i+1), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        products.sort((a, b) -> {
            if (a.getProfit() < b.getProfit())
                return 1;
            return -1;
        });
        products.forEach(System.out::println);
    }
}

class Product {
    private String id;
    private String name;
    private String type;
    private double priceIn;
    private double priceOut;

    public Product() {
    }

    public Product(String id, String name, String type, double priceIn, double priceOut) {
        this.id = id;
        this.name = name;
        this.type = type;
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
        return id + " " +  name + " " + type + " " + String.format("%.2f", getProfit());
    }
}
