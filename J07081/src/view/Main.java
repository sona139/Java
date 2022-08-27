/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<Sv> l = new ArrayList<>();
        while(t-- > 0) {
            l.add(new Sv(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(l, new Comparator<Sv>() {
            @Override
            public int compare(Sv o1, Sv o2) {
                if (o1.getLastName().compareTo(o2.getLastName()) != 0)
                    return o1.getLastName().compareTo(o2.getLastName());
                if (o1.getName().compareTo(o2.getName()) != 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getId().compareTo(o2.getId());
            }
            
        });
        
        for (Sv i : l){
            System.out.println(i);
        }
    }
}

class Sv{
    private String id, name, phone, email, lastName;

    public Sv() {
    }

    public Sv(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        String[] lName = this.name.split("\\s+");
        this.lastName = lName[lName.length-1];
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + email;
    }
    
    
}