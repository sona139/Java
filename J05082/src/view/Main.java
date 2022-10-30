/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 0; i < n; i++)
            customers.add(new Customer(String.format("KH%03d", i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        customers.sort((a, b) -> {
            Date date1 = a.getBirthDay();
            Date date2 = b.getBirthDay();
            return date1.compareTo(date2);
        });
        customers.forEach(System.out::println);
    }
}

class Customer {
    private String id;
    private String name;
    private String sex;
    private String birthDay;
    private String address;
    
    public Customer() {
    }

    public Customer(String id, String name, String sex, String birthDay, String address) {
        this.id = id;
        setName(name);
        this.sex = sex;
        setBirthDay(birthDay);
        this.address = address;
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
        String[] names = name.trim().split("\\s+");
        for (int i = 0; i < names.length; i++)
            names[i] = Character.toUpperCase(names[i].charAt(0)) + names[i].substring(1, names[i].length()).toLowerCase();
        this.name = String.join(" ", names);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(birthDay);
        } catch (ParseException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Date();
    }

    public void setBirthDay(String birthDay) {
        if (birthDay.charAt(1) == '/')
            birthDay = "0" + birthDay;
        if (birthDay.charAt(4) == '/')
            birthDay = birthDay.substring(0, 3) + "0" + birthDay.substring(3, birthDay.length());
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + address + " " + birthDay;
    }
}
