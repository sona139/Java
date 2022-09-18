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
//        Scanner sc =  new Scanner(System.in);
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> names = new ArrayList<>();
        while(sc.hasNextLine()) {
            String[] list = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < list.length; j++)
                list[j] = list[j].substring(0, 1).toUpperCase() + list[j].substring(1).toLowerCase();
            String[] listMidName = new String[list.length-2];
            for (int j = 1; j < list.length-1; j++)
                listMidName[j-1] = list[j];
            names.add(new Name(list[0], String.join(" ", listMidName), list[list.length-1]));
        }
        names.sort((a, b) -> {
            if (a.getLastName().equals(b.getLastName()) == false)
                return a.getLastName().compareTo(b.getLastName());
            if (a.getFirstName().equals(b.getFirstName()) == false)
                return a.getFirstName().compareTo(b.getFirstName());
            return a.getMidName().compareTo(b.getMidName());
        });
        
        names.forEach(System.out::println);
    }
}

class Name {
    private String firstName;
    private String midName;
    private String lastName;

    public Name() {
    }

    public Name(String firstName, String midName, String lastName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    

    @Override
    public String toString() {
        return firstName + " " + midName + " " + lastName;
    }
}
