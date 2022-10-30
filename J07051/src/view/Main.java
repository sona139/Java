/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> customers = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            customers.add(new Customer(String.format("KH%02d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        customers.sort((a, b) -> {
            return b.getPrice()-a.getPrice();
        });
        customers.forEach(System.out::println);
    }
}

final class Customer {
    private String id;
    private String name;
    private String room;
    private Date dateIn;
    private Date dateOut;
    private int fee;

    public Customer() {
    }

    public Customer(String id, String name, String room, String dateIn, String dateOut, int fee) throws ParseException {
        this.id = id;
        setName(name);
        this.room = room;
        this.dateIn = convertStringToDate(dateIn);
        this.dateOut = convertStringToDate(dateOut);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }
    
    public Date convertStringToDate(String s) throws ParseException {
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(1) == '/')
            sb.insert(0, '0');
        if (sb.charAt(4) == '/')
            sb.insert(3, '0');
        return new SimpleDateFormat("dd/MM/yyyy").parse(sb.toString());
    }
    
    private long getDays() {
        long getDiff = dateOut.getTime()-dateIn.getTime();
        return TimeUnit.MILLISECONDS.toDays(getDiff)+1;
    }
    
    private int priceForfloor() {
        switch(room.substring(0, 1)) {
            case "1":
                return 25;
            case "2":
                return 34;
            case "3":
                return 50;
            default:
                return 80;
        }
    }
    
    public int getPrice() {
        return (int) (priceForfloor()*getDays()) + fee;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + getDays() + " " + getPrice();
    }
}
