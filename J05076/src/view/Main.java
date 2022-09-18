/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
        Map<String, Product> mapProduct = new HashMap<>();
        for (int i = 0; i < n; i++) {
            products.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            mapProduct.put(products.get(i).getId(), products.get(i));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<IEProduct> IE = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String id = sc.next();
            IE.add(new IEProduct(id, mapProduct.get(id), Long.parseLong(sc.next()), Long.parseLong(sc.next()), Long.parseLong(sc.next())));
        }
        IE.forEach(System.out::println);
    }
}

class IEProduct {
    private String idProduct;
    private Product product;
    private long numberOfProductImport;
    private long priceImport;
    private long numberOfProductExport;

    public IEProduct(String idProduct, Product product, long numberOfProductImport, long priceImport, long numberOfProductExport) {
        this.idProduct = idProduct;
        this.product = product;
        this.numberOfProductImport = numberOfProductImport;
        this.priceImport = priceImport;
        this.numberOfProductExport = numberOfProductExport;
    }

    public IEProduct() {
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getNumberOfProductImport() {
        return numberOfProductImport;
    }

    public void setNumberOfProductImport(long numberOfProductImport) {
        this.numberOfProductImport = numberOfProductImport;
    }

    public long getPriceImport() {
        return priceImport;
    }

    public void setPriceImport(long priceImport) {
        this.priceImport = priceImport;
    }

    public long getNumberOfProductExport() {
        return numberOfProductExport;
    }

    public void setNumberOfProductExport(long numberOfProductExport) {
        this.numberOfProductExport = numberOfProductExport;
    }
    
    private double getProfit() {
        switch(product.getType()) {
            case "A":
                return 1.08;
            case "B":
                return 1.05;
            case "C":
                return 1.02;
        }
        return 1.0;
    }
    
    private long getTotalPriceImport() {
        return numberOfProductImport*priceImport;
    }
    
    private long getTotalPriceExport() {
        return (long) (numberOfProductExport*priceImport*getProfit());
    }

    @Override
    public String toString() {
        return idProduct + " " + product.getName() + " " + getTotalPriceImport() + " " + getTotalPriceExport();
    }
}

class Product {
    private String id;
    private String name;
    private String type;

    public Product() {
    }

    public Product(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
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
}
