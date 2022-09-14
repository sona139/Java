/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc =  new Scanner(new FileInputStream("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++)
            products.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        products.sort((a, b) -> {
            if(a.getPrice() != b.getPrice())
                return b.getPrice()-a.getPrice();
            return a.getId().compareTo(b.getId());
        });
        products.forEach(System.out::println);
        sc.close();
    }
}

class Product {
    private String id;
    private String name;
    private int price;
    private int month;

    public Product() {
    }

    public Product(String id, String name, int price, int month) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.month = month;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + month;
    }
}